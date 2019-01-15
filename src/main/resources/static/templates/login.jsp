<!DOCTYPE html>
<html ng-app = "AppLogin">
<head>
    <meta charset="utf-8" />
    <title>Creditos</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css" integrity="sha384-PmY9l28YgO4JwMKbTvgaS7XNZJ30MK9FAZjjzXtlqyZCqBY6X6bXIkM++IkyinN+" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body style="background: #ebebeb;" >

    <div class = "container" ng-controller="ctrlLogin">
        
       
        <!-- Login -->
        <div class="row" ng-show = "mostrarLogin" >
            <div class="col-md-4 col-md-offset-4" style="background:#fff;padding:40px;margin-top:60px;"  >
                <h1>Iniciar Sesión</h1>
                <hr>
                <form name = formLogin novalidate >
                    <div class="form-group">
                        <input type="text" placeholder="11.111.111-1" class="form-control" ng-pattern = "/^[0-9]{1,2}.[0-9]{3}.[0-9]{3}-[0-9Kk]{1}$/" ng-model = "rut" required/>
                    </div>
                    <div class="form-group" >

                        <input type="password" placeholder="Contraseña" class="form-control" ng-model ="pass" required>
                    </div>
                    <div>
                        <button type="button" class="btn btn-primary btn-block" ng-click="validarLogin()" >Ingresar</button>
                    </div>
                </form>
                <hr/>
                <div class="bg-warning" style="padding:15px;" ng-show="mostrarError" >Usuario o Pass incorrectos.</div>
            </div>
        </div>

        
       

        <div class="row" ng-hide="mostrarLogin">
                <div class="col-md-4 col-md-offset-4" style="background:#fff;padding:40px;margin-top:60px;"  >
                    <h1>Bienvenido {{rut}}</h1>
                    <ul>
                        <li ng-repeat = "comentario in comentarios.data">
                            <h2> {{comentario.comentario}}</h2>
                            <p>
                                {{comentario.fecha}}
                            </p>
                        </li>
                    </ul>
                </div>
            </div>

    </div>

    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js" integrity="sha384-vhJnz1OVIdLktyixHY4Uk3OHEwdQqPppqYR8+5mjsauETgLOcEynD9oPHhhz18Nw" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.min.js" type ="text/javascript"></script>
    <script src="../MiAplicacionAngular.js" type = text/javascript></script>
</body>
</html>