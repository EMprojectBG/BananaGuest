<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1 ,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css" type="text/css">
    <title>Banana APP</title>
</head>

<body>
  
            <!--tabla contenido proyectos-->
            <div class="col-md-9">
                <div class="profile-content">
                    <div class="span7">
                        <div class="widget stacked widget-table action-table">

                            <div class="widget-header">
                                <i class="icon-th-list"></i>
                                <h3>Proyectos en curso.</h3>
                            </div>
                            <!-- header -->

                            <div class="widget-content">

                                <table class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                            <th>Projects</th>
                                            <th>Users</th>
                                            <th>Options</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr id='fila1'>
                                            <td>
                                                BearApp</td>
                                            <td>Arthur D., John F., Dave D. and Clair M.</td>
                                            <td><button class='btn_borrar' data-id='fila1'>Delete</button>
                                            <button class='btn_editar'>Edit</button></td>

                                        </tr>
                                        <tr id='fila2'>
                                            <td>Coke </td>
                                            <td>Arthur D., Jason L., James D.</td>
                                            <td><button class='btn_borrar' data-id='fila2'>Delete</button>
                                            <button class='btn_editar'>Edit</button></td>

                                        </tr>
                                        <tr id='fila3'>
                                            <td>Chips'n'xips</td>
                                            <td>Arthur D., Jason L. and Dave D.</td>
                                            <td><button class='btn_borrar' data-id='fila3'>Delete</button>
                                            <button class='btn_editar'>Edit</button></td>

                                        </tr>
                                        <tr id='fila4'>
                                            <td>Rock'n'Roll app</td>
                                            <td>Arthur D., Jason L. and Dave D.</td>
                                            <td><button class='btn_borrar' data-id='fila4'>Delete</button>
                                            <button class='btn_editar'>Edit</button></td>

                                        </tr>
                                        <tr id='fila5'>
                                            <td>Letter's</td>
                                            <td>Arthur D., John F., Dave D. and Clair M.</td>
                                            <td><button class='btn_borrar' data-id='fila5'>Delete</button>
                                            <button class='btn_editar'>Edit</button></td>

                                        </tr>
                                        <tr id='fila6'>
                                            <td>Game</td>
                                            <td>Arthur D., John F., Dave D. and Clair M.</td>
                                            <td><button class='btn_borrar' data-id='fila6'>Delete</button>
                                            <button class='btn_editar'>Edit</button></td>
                                        </tr>
                                        <div id='table_inner'></div>
                                    </tbody>
                                </table>

                            </div>
                            <!-- /widget-content -->

                        </div>
                        <!-- /widget -->
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!-- modal edit -->
    <div id='modal_edit' class="modal fade" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" id='btn_x' data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id='tit_editarproyecto'>Editar Proyecto</h4>
                </div>
                <div class="modal-body" id="modal_inner"></div>
                <div class="modal-footer">
                    <button id="btn_closemodal" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" id='btn_save'>Save changes</button>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
    </div>
    <!-- /.modal -->

        <!-- modal nuevo proyecto-->
    <div id='modal_nuevo' class="modal fade" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" id='btn_xnuevo' data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id='tit_nuevo_proyecto'>Nuevo proyecto</h4>
                </div>
                <div class="modal-body" id="modalnuevo_inner"></div>
                <div class="modal-footer">
                    <button id="btn_closemodalnuevo" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button id='btn_save'class="btn btn-primary">Save changes</button>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
    </div>
    <!-- /.modal -->



    <footer>
        <center>
            <strong>Powered by <a href="" target="_blank">BananaProjects</a></strong>
        </center>
        <br>
        <br>
    </footer>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src='scripts/bananaguest.js'></script>

</html>