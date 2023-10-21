<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="format-detection" content="telephone=no" />
    <link rel="icon" href="images/favicon.ico" type="image/x-icon" />
    <title>PRIVACY</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet" />

    <!-- Links -->
    <link rel="stylesheet" href="css/search.css" />

    <!--JS-->
    <script src="js/jquery.js"></script>
    <script src="js/jquery-migrate-1.2.1.min.js"></script>
    <script src="js/rd-smoothscroll.min.js"></script>

    <!--[if lt IE 9]>
      <div style="clear: both; text-align: center; position: relative">
        <a href="http://windows.microsoft.com/en-US/internet-explorer/..">
          <img
            src="images/ie8-panel/warning_bar_0000_us.jpg"
            border="0"
            height="42"
            width="820"
            alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."
          />
        </a>
      </div>
      <script src="js/html5shiv.js"></script>
    <![endif]-->
    <script src="js/device.min.js"></script>
  </head>
  <body>

  <?php
        include('connection.php');
        $conn = getConnection();
        $titulo = $_GET['buscar'];

        $sqlQuery = "SELECT * FROM noticia WHERE titulo LIKE '%$titulo%' AND publicada='1' ORDER BY fecha DESC";
        $results = mysqli_query($conn, $sqlQuery);

    ?>

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
                <ul
                  class="nav navbar-nav sf-menu sf-js-enabled sf-arrows"
                  data-type="navbar"
                >
                  <li style="list-style: none" class="active">
                    <a href="home.php">INICIO</a>
                  </li>
                </ul>
              </div>
            </nav>
            <form
              class="search-form"
              action="buscador.php"
              method="GET"
              accept-charset="utf-8"
            >
              <label class="search-form_label">
                <input
                  class="search-form_input"
                  type="text"
                  name="buscar"
                  autocomplete="off"
                  placeholder="Ingrese Texto"
                />
                <span class="search-form_liveout"></span>
              </label>
              <button
                class="search-form_submit fa-search"
                type="submit"
              ></button>
            </form>
          </div>
        </div>
      </header>

      <!--========================================================
                            CONTENT
  =========================================================-->

      <main>
        <section class="well well4">
          <div class="container">
            <h2>Texto Buscado</h2>
            <div class="row offs2">
              <?php while ($row = mysqli_fetch_array($results)): ?>
              <?php 
                preg_match('/<img src="(.*?)"/', $row['imagen'], $matches);
                $imageLink = $matches[1];  
              ?>
              <table width="90%" align="center">
                <tbody>
                  <tr>
                    <td>
                      <a href="detalle.php?id=<?= $row['id'] ?>">
                        <img src="<?= $imageLink ?>" style="object-fit:cover; border-radius:10px; width: 350px; aspect-ratio:16/9; max-width:350px"/>
                      </a>
                    </td>
                    <td width="25"></td>
                    <td style="text-align: justify" valign="top">
                      <a
                        style="text-align: justify; font-size: 20px; font-weight:700"
                        href="detalle.php?id=<?= $row['id'] ?>"
                        class="banner"
                      >
                        <?= $row['titulo'] ?>
                      </a>
                      <div class="verOcultar">
                        <?= $row['resumen'] ?><a
                          href="detalle.php?id=<?= $row['id'] ?>"
                          style="color: blue"
                        >
                          Leer Mas - <?= $row['fecha'] ?></a
                        >
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
              <hr />
              <?php endwhile; ?>
            </div>
          </div>
        </section>
      </main>

      <!--========================================================
                            FOOTER
  =========================================================-->
      <footer>
        <section class="well">
          <div class="container">
            <p class="rights">
              Denominación Empresa &#169; <span id="copyright-year"></span>
              <a href="index-5.html">Privacy Policy</a>
              <!-- {%FOOTER_LINK} -->
            </p>
          </div>
        </section>
      </footer>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/tm-scripts.js"></script>
    <!-- </script> -->

    <!-- coded by vitlex -->
  </body>
</html>
