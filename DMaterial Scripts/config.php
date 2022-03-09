<?php
    //this is the main config file
    $server = "sql284.main-hosting.eu";
    $user = "u877822597_d_admin";
    $pass = "Hasnain@123";
    $dbname = "u877822597_d_material";
    $connect = mysqli_connect($server, $user, $pass, $dbname);
    if(!isset($connect)){
        die("Connection failed: " . mysqli_connect_error());
    }
?>