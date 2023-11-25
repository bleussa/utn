<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TP N°10</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container mt-5">
            <h1 style="margin-bottom: 20px">Generador de reportes en PHP</h1>
            <form action="generarXLSX.php" method="post">
                <div class="row">
                    <div class="col">
                        <label for="pais" class="form-label">País:</label>
                        <input type="text" id="pais" name="pais" class="form-control" required>
                    </div>
                    <div class="col">
                        <label for="region" class="form-label">Región:</label>
                        <select id="region" name="region" class="form-select">
                            <?php
                                require_once "connection.php";
                                $sql = "SELECT DISTINCT Region FROM Country";
                                $conn = getConnection();
                                $result = $conn->query($sql);
                                
                                if ($result->num_rows > 0) {
                                    while ($row = $result->fetch_assoc()) { ?>
                                        <option value ="<?= $row["Region"] ?>"><?= $row["Region"] ?></option>
                                    <?php }
                                } 

                                $conn->close();
                            ?>
                        </select>
                    </div>
                    <div class="col">
                        <input type="submit" class="btn btn-primary" value="Generar XLSX">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
