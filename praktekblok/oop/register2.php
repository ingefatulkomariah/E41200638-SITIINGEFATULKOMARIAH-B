<?php
require ('koneksi2.php');
require('query.php');

$obj = new crud;

if ($_SERVER['REQUEST_METHOD']=='POST');
$email = $_POST['user_email'];
$pass = $_POST['user_password'];
$name = $_POST['user_fullname'];
if($obj->insertData($email, $pass, $name));
echo '<div class="alert alert-succes">Data berhasil di simpan</div>';
else:
    echo '<div class="alert alert-danger">Data gagal di simpan</div>';

endif;
?>
<!DOCTYPE html>
<html>
<head>
	<title>REGISTER</title>
</head>
<body>
	<form action="register2.php" method="POST" style="padding: 10px;">
		<p>ID : <br>
			<input type="text" name="id" required>
		</p> 
		<p>Email : <br>
			<input type="text" name="user_email" required>
		</p>
		<p>Password : <br>
			<input type="Password" name="user_password" required>
		</p>
		<p>Fullname : <br>
			<input type="text" name="user_fullname" required>
		</p>
		<button type="submit" name="register">DAFTAR</button>
	</form>
	<!--<P style="padding: 10px;"><a href="login2.php">LOGIN</P>-->
</body>
</html>
