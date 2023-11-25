<?php
require './vendor/autoload.php';
use PhpOffice\PhpSpreadsheet\Spreadsheet;
use PhpOffice\PhpSpreadsheet\Writer\Xlsx;

if($_SERVER["REQUEST_METHOD"] == "POST"){
$nombrePais = $_POST["pais"];
$nombreRegion = $_POST["region"];

$spreadsheet = new Spreadsheet();

$sheet = $spreadsheet->getActiveSheet();

$header_row_array = ['Ciudad', 'Población', 'País', 'Región'];
$spreadsheet->getActiveSheet()->fromArray( $header_row_array);

require_once "connection.php";
$conn = getConnection();
$stmt = $conn->prepare("SELECT ciudad.Name, ciudad.Population, pais.Name as NombrePais, pais.Region FROM City ciudad INNER JOIN
Country pais ON ciudad.CountryCode = pais.Code WHERE pais.Region = ? AND pais.Name
LIKE ? ORDER BY pais.Name");
$nombrePais =  '%' . $nombrePais .'%';
$stmt->bind_param("ss", $nombreRegion,  $nombrePais);
$stmt->execute();

$result = $stmt->get_result();
if ($result->num_rows > 0) {
    $rowPointer = 2; //la primera esta ocupada por el header
    while ($row = $result->fetch_assoc()) {
        $rowData = array($row['Name'], $row['Population'], $row['NombrePais'], $row['Region']);
        $spreadsheet->getActiveSheet()->fromArray($rowData,null,"A".$rowPointer);
        $rowPointer++; 
    }
}

$stmt->close();
$conn->close();

$fileName = 'reporteXLSX.xlsx';

$writer = new Xlsx($spreadsheet);

header('Content-Type: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet');
header('Content-Disposition: attachment;filename="' . $fileName . '"');
header('Cache-Control: max-age=0');

$writer->save('php://output');

}