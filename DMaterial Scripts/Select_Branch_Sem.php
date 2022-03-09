<?php
    require_once("config.php");
    $sql = "SELECT * FROM `select_branch_sem_table`";
    $r = mysqli_query($connect,$sql);
    $result = array();

    while($row = mysqli_fetch_array($r)){
        if($row['branch']!=NULL)
        {
            array_push($result,array(
                'branch'=>$row['branch']
            ));
        }
        if($row['semester']!=NULL){
            array_push($result,array(
                'semester'=>$row['semester']
            ));
        }
        if($row['language']!=NULL){
            array_push($result,array(
                'language'=>$row['language']
            ));
        }
    }

    echo json_encode(array('result'=>$result));

    mysqli_close($connect);
