<?php
require ('koneksi.php');

session_start ();

if (isset($_POST['submit']) ){
    $email = $_POST['user_email'];
    $pass = $_POST['user_password'];

    /* 
    $emailcheck = mysqli_real_escape_string($koneksi,$email);
    $passcheck = mysqli_real_escape_string($koneksi, $pass);
    */

    if (!empty(trim($email)) && !empty(trim($pass))) {
        //select data berdasarkan username dari database

        $query = "SELECT * FROM user_detail WHERE user_email = '$email'";
        $result = mysqli_query($koneksi, $query);
        $num = mysqli_num_rows($result);

        while ($row = mysqli_fetch_array($result)) {
            $id = $row ['id'];
            $userVal = $row['user_email'];
            $passVal = $row['user_password'];
            $userName = $row['user_fullname'];
            $level = $row['level'];
        }
        

        if ($num != 0) {
            if ($userVal==$email && $passVal==$pass) {
                header ('Location: home.php');
            } else{
                $error = 'user atau password salah !!';
                header ('Location: login.php');
            }
            } else {
                $error = 'user tidak di temukan!!';
                header ('Location: login.php');
            }
            } else {
                $error = 'data tidak boleh kosong!!';
                echo $error;
            }
        }
?>

<html>
    <head>
        <title>Login page</title>
    </head>
<body>
      <form action ="home.php" method="POST">
          <p> email &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="user_email"></p>
          <p> password : <input type="password" name ="user_password" ></p>
            <button type="submit" name="submit">Sign In</button>
</form>
</body>
</html>

