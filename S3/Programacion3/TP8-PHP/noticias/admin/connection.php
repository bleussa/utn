<?php

function getConnection(){
    $host = 'localhost';
    $user = 'root';
    $pass = '';
    $db = 'php';

    $conn = mysqli_connect($host, $user, $pass);

    mysqli_select_db($conn, $db);

    return $conn;
};

?>