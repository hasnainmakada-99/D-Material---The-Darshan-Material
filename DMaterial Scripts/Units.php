<?php
    require_once("config.php");
    $sql = "SELECT * FROM `Units_Table`";
    $r = mysqli_query($connect,$sql);
    $result = array();

    while($row = mysqli_fetch_array($r)){
        if($row['Computer_Sem3_os']!=NULL){
            array_push($result,array(
                'Computer_Sem3_os'=>$row['Computer_Sem3_os']
            ));
        }

        if($row['Computer_Sem3_cpp']!=NULL){
            array_push($result,array(
                'Computer_Sem3_cpp'=>$row['Computer_Sem3_cpp']
            ));
        }

        if($row['Computer_Sem3_dbms']!=NULL){
            array_push($result,array(
                'Computer_Sem3_dbms'=>$row['Computer_Sem3_dbms']
            ));
        }

        if($row['Computer_Sem3_ds']!=NULL){
            array_push($result,array(
                'Computer_Sem3_ds'=>$row['Computer_Sem3_ds']
            ));
        }

        if($row['Computer_Sem3_malp']!=NULL){
            array_push($result,array(
                'Computer_Sem3_malp'=>$row['Computer_Sem3_malp']
            ));
        }

        if($row['Computer_Sem4_adbms']!=NULL){
            array_push($result,array(
                'Computer_Sem4_adbms'=>$row['Computer_Sem4_adbms']
            ));
        }

        if($row['Computer_Sem4_cn']!=NULL){
            array_push($result,array(
                'Computer_Sem4_cn'=>$row['Computer_Sem4_cn']
            ));
        }

        if($row['Computer_Sem4_dotnet']!=NULL){
            array_push($result,array(
                'Computer_Sem4_dotnet'=>$row['Computer_Sem4_dotnet']
            ));
        }

        if($row['Computer_Sem4_coa']!=NULL){
            array_push($result,array(
                'Computer_Sem4_coa'=>$row['Computer_Sem4_coa']
            ));
        }

        if($row['Computer_Sem4_fsd']!=NULL){
            array_push($result,array(
                'Computer_Sem4_fsd'=>$row['Computer_Sem4_fsd']
            ));
        }

        if($row['Computer_Sem5_cmt']!=NULL){
            array_push($result,array(
                'Computer_Sem5_cmt'=>$row['Computer_Sem5_cmt']
            ));
        }

        if($row['Computer_Sem5_dwpd']!=NULL){
            array_push($result,array(
                'Computer_Sem5_dwpd'=>$row['Computer_Sem5_dwpd']
            ));
        }

        if($row['Computer_Sem5_java']!=NULL){
            array_push($result,array(
                'Computer_Sem5_java'=>$row['Computer_Sem5_java']
            ));
        }

        if($row['Computer_Sem5_mat']!=NULL){
            array_push($result,array(
                'Computer_Sem5_mat'=>$row['Computer_Sem5_mat']
            ));
        }

        if($row['Computer_Sem6_ajava']!=NULL){
            array_push($result,array(
                'Computer_Sem6_ajava'=>$row['Computer_Sem6_ajava']
            ));
        }

        if($row['Computer_Sem6_dwsl']!=NULL){
            array_push($result,array(
                'Computer_Sem6_dwsl'=>$row['Computer_Sem6_dwsl']
            ));
        }

        if($row['Computer_Sem6_awt']!=NULL){
            array_push($result,array(
                'Computer_Sem6_awt'=>$row['Computer_Sem6_awt']
            ));
        }
    }

    echo json_encode(array('result'=>$result));

    mysqli_close($connect);

?>