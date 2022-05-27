<?php 

require ('koneksi.php');
if(isset ($_POST['register']) ){
	$id = $_POST['id'];
	$userMail = $_POST['user_email'];
	$userPass = $_POST['user_password'];
	$userName = $_POST['user_fullname'];

	$query = "INSERT INTO user_detail VALUES ('$id', '$userMail', '$userPass', '$userName', 2)";
	$result = mysqli_query($koneksi, $query);
	header('Location: login.php');
}

?>

<!DOCTYPE html>
<html>
<head>
	<title>REGISTER</title>
</head>
<body>
	<form action="register.php" method="POST" style="padding: 10px;">
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
	<P style="padding: 10px;"><a href="login.php">LOGIN</P>
</body>
</html>