<?php

function getConnection(){
    $host = 'localhost';
    $user = 'root';
    $pass = '';
    $db = 'world';

    $conn = mysqli_connect($host, $user, $pass);

    mysqli_select_db($conn, $db);

    return $conn;
};

?>