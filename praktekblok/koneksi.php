<?php
$server = "localhost";
$username = "root";
$password  = "";
$db = "user";
$koneksi = mysqli_connect($server, $username, $password, $db);

if (mysqli_connect_error()) {
    echo "Koneksi gagal : ".mysqli_connect_error();
}
    ?>