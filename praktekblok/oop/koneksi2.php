<?php
class koneksi
{
private $host="localhost";
private $user="root";
private $pass="";
private $db="user";
protected $koneksi;
public function_construct() {
    try{
        $this->koneksi = new PDO ("mysqli:host=$this->host; dbname=$this->db", $this->user, $this->pass);
        $this->koneksi->setAttribute(PDO: :AATR_ERRMODE, PDO: :ERRMODE_EXCEPTION);

    }
    catch (PDOException $e)
    {
        echo $e->getMessage();

    }
    return $this->koneksi;
}
}
?>