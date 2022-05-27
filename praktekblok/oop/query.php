<?php
class crud extends koneksi
{
    public function lihatData()
    {
        $sql ="SELECT * FROM user_detail";
        $result =$this->koneksi->prepare($sql);
        return $result;
    }
    public function detailData($data)
{
    # GET DATA
    try 
    {
        $sql ="SELECT * FROM user_detail WHERE id=:id";
        $result=$this->koneksi->prepare($sql);
        $result->bindParam(":id", $data);
        $result->execute();
        $result->bindColumn(1,$this->id);
        $result->bindColumn(2, $this->user_email);
        $result->bindColumn(3, $this->user_password);
        $result->bindColumn(4, $this->user_fullname);
        $result->fetch (PDO: : FETCH_ASSOC);
        if($result->rowCount()==1):
            return true;
        else:
            return false;
        endif;


    }
    catch (PDOException $e)
    {
        echo $e->getMessage();
    }
}

public function updateData($email,$pass, $name, $data)
{
try
{
    $sql="UPDATE user_detail SET user_email=:email, user_password=:pass, user_fullname=:name WHERE id=:id";
    $result=$this->koneksi->prepare($sql);
    $result->bindParam(":email", $email);
    $result->bindParam(":pass", $pass);
    $result->bindParam(":name", $name);
    $result->bindParam(":id", $data);
    $result->execute();
    return true;
}
catch (PDOException $e)
{
    echo $e->getMessage();
    return false;
}
}

public function delete ($data)
{
    try {
        $sql="DELETE FROM user_detail WHERE id=:id";
        $result=$this->koneksi->prepare($sql);
        $result->execute(array("id"=>$data));
        return true;

    }
    catch (PDOException $e)
    {
        echo $e->getMessage();
        return false; 
    } 
}

    public function insertData($email, $pass, $name)
{
try {
    $sql="INSERT INTO user_detail(user_email, user_password, user_fullname,level ) VALUES (:email, :pass, :name, 2)";
    $result=$this->koneksi->prepare($sql);
    $result->bindParam(":email", $email);
    $result->bindParam(":pass", $pass);
    $result->bindParam(":name", $name);
    $result->execute();
    return true;
}
catch(PDOException $e)
{
    echo $e->getMessage();
    return false;
}
}
}
?>