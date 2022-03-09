<?php
    require_once("config.php");
    $sql = "SELECT * FROM `branch_table`";
    $r = mysqli_query($connect,$sql);
    $result = array();

    while($row = mysqli_fetch_array($r)){
        if($row['Computer_Sem1']!=NULL)
        {
            array_push($result,array(
                'Computer_Sem1'=>$row['Computer_Sem1']
            ));
        }
        if($row['Computer_Sem2']!=NULL){
            array_push($result,array(
                'Computer_Sem2'=>$row['Computer_Sem2']
            ));
        }
        if($row['Computer_Sem3']!=NULL){
            array_push($result,array(
                'Computer_Sem3'=>$row['Computer_Sem3']
            ));
        }

        if($row['Computer_Sem4']!=NULL){
            array_push($result,array(
                'Computer_Sem4'=>$row['Computer_Sem4']
            ));
        }

        if($row['Computer_Sem5']!=NULL){
            array_push($result,array(
                'Computer_Sem5'=>$row['Computer_Sem5']
            ));
        }

        if($row['Computer_Sem6']!=NULL){
            array_push($result,array(
                'Computer_Sem6'=>$row['Computer_Sem6']
            ));
        }

        if($row['Civil_Sem1']!=NULL){
            array_push($result,array(
                'Civil_Sem1'=>$row['Civil_Sem1']
            ));
        }

        if($row['Civil_Sem2']!=NULL){
            array_push($result,array(
                'Civil_Sem2'=>$row['Civil_Sem2']
            ));
        }

        if($row['Civil_Sem3']!=NULL){
            array_push($result,array(
                'Civil_Sem3'=>$row['Civil_Sem3']
            ));
        }

        if($row['Civil_Sem4']!=NULL){
            array_push($result,array(
                'Civil_Sem4'=>$row['Civil_Sem4']
            ));
        }
        if($row['Civil_Sem5']!=NULL){
            array_push($result,array(
                'Civil_Sem5'=>$row['Civil_Sem5']
            ));
        }

        if($row['Civil_Sem6']!=NULL){
            array_push($result,array(
                'Civil_Sem6'=>$row['Civil_Sem6']
            ));
        }

        if($row['Mech_Sem1']!=NULL){
            array_push($result,array(
                'Mech_Sem1'=>$row['Mech_Sem1']
            ));
        }

        if($row['Mech_Sem2']!=NULL){
            array_push($result,array(
                'Mech_Sem2'=>$row['Mech_Sem2']
            ));
        }

        if($row['Mech_Sem3']!=NULL){
            array_push($result,array(
                'Mech_Sem3'=>$row['Mech_Sem3']
            ));
        }

        if($row['Mech_Sem4']!=NULL){
            array_push($result,array(
                'Mech_Sem4'=>$row['Mech_Sem4']
            ));
        }

        if($row['Mech_Sem5']!=NULL){
            array_push($result,array(
                'Mech_Sem5'=>$row['Mech_Sem5']
            ));
        }

        if($row['Mech_Sem6']!=NULL){
            array_push($result,array(
                'Mech_Sem6'=>$row['Mech_Sem6']
            ));
        }

        if($row['Elect_Sem1']!=NULL){
            array_push($result,array(
                'Elect_Sem1'=>$row['Elect_Sem1']
            ));
        }

        if($row['Elect_Sem2']!=NULL){
            array_push($result,array(
                'Elect_Sem2'=>$row['Elect_Sem2']
            ));
        }

        if($row['Elect_Sem3']!=NULL){
            array_push($result,array(
                'Elect_Sem3'=>$row['Elect_Sem3']
            ));
        }

        if($row['Elect_Sem4']!=NULL){
            array_push($result,array(
                'Elect_Sem4'=>$row['Elect_Sem4']
            ));
        }

        if($row['Elect_Sem5']!=NULL){
            array_push($result,array(
                'Elect_Sem5'=>$row['Elect_Sem5']
            ));
        }

        if($row['Elect_Sem6']!=NULL){
            array_push($result,array(
                'Elect_Sem6'=>$row['Elect_Sem6']
            ));
        }


    }

    echo json_encode(array('result'=>$result));

    mysqli_close($connect);
