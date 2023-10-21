<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="format-detection" content="telephone=no"/>
    <link rel="icon" href="images/favicon.ico" type="image/x-icon">
    <title>HOME</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Links -->
    <link rel="stylesheet" href="css/camera.css">
    <link rel="stylesheet" href="css/search.css">
    <link rel="stylesheet" href="css/google-map.css">


    <!--JS-->
    <script src="js/jquery.js"></script>
    <script src="js/jquery-migrate-1.2.1.min.js"></script>
    <script src="js/rd-smoothscroll.min.js"></script>

    <!-- PHP -->
    <?php
        include('connection.php');
        $conn = getConnection();

        $sqlQuery = "SELECT * FROM noticia WHERE publicada='1' ORDER BY fecha DESC LIMIT 5";
        $results = mysqli_query($conn, $sqlQuery);

    ?>


    <!--[if lt IE 9]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/..">
            <img src="images/ie8-panel/warning_bar_0000_us.jpg" border="0" height="42" width="820"
                 alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
        </a>
    </div>
    <script src="js/html5shiv.js"></script>
    <![endif]-->
    <script src='js/device.min.js'></script>
  </head>
  <body>
  <div class="page">
  <!--========================================================
                            HEADER
  =========================================================-->
    <header>  
      <div class="container top-sect">
        <div class="navbar-header">
          <h1 class="navbar-brand">
            <a data-type='rd-navbar-brand'  href="./"><small>Portal de <br>Noticias</small></a>
          </h1>
          <a class="search-form_toggle" href="#"></a>
        </div>
      </div>
     
	  <div id="stuck_container" class="stuck_container">
        <div class="container">   
			<nav class="navbar navbar-default navbar-static-top pull-left">            
				<div class="">  
				  <ul class="nav navbar-nav sf-menu sf-js-enabled sf-arrows" data-type="navbar">
					<li style="list-style: none;" class="active">
					  <a href="home.php">INICIO</a>
					</li>
				  </ul>                           
				</div>
			</nav>
			<form class="search-form" action="buscador.php" method="GET" accept-charset="utf-8">
			  <label class="search-form_label">
				<input class="search-form_input" type="text" name="buscar" autocomplete="off" placeholder="Ingrese Texto"/>
				<span class="search-form_liveout"></span>
			  </label>
			  <button class="search-form_submit fa-search" type="submit"></button>
			</form>
             
        </div>

      </div>  

    </header>

  <!--========================================================
                            CONTENT
  =========================================================-->

    <main>        

      <section class="well well1 well1_ins1">
        <div class="camera_container">
          <div id="camera" class="camera_wrap">
            <?php while ($row = mysqli_fetch_array($results)): ?>
            <?php 
              preg_match('/<img src="(.*?)"/', $row['imagen'], $matches);
              $imageLink = $matches[1];  
            ?>

              <div data-src="<?= $imageLink ?>">
                <div class="camera_caption fadeIn">
                  <div class="jumbotron jumbotron1">
                    <em>
                      <a href="detalle.php?id=<?= $row['id'] ?>"><?= $row['titulo'] ?></a>
                    </em>
                    <div class="wrap">
                      <p>
                        <?= $row['resumen'] ?>
                      </p>
                      <a href="detalle.php?id=<?= $row['id'] ?>" class="btn-link fa-angle-right"></a>
                    </div>  
                  </div>
                </div>
              </div>
            <?php endwhile; ?>
            </div>
          </div>
        </div>
      
      </section>
      
    

    </main>

  </div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Include all compiled plugins (below), or include individual files as needed -->         
    <script src="js/bootstrap.min.js"></script>
    <script src="js/tm-scripts.js"></script>    
  <!-- </script> -->


  </body>
</html>
