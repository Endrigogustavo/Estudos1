<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>aprovar.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    $n2 = $_POST['txtn2'];
    $n3 = $_POST['txtn3'];
    $n4 = $_POST['txtn4'];
    $media = ($n1+$n2+$n3+$n4)/4;
    if($media>=5)
    echo 'parabéns você foi aprovado'.'<br/>'.'sua média foi de:'.$media; 
    else
    echo 'que pena você foi reprovado'.'<br/>'.'sua média foi de:'.$media;
  ?> 
</body>
</html>