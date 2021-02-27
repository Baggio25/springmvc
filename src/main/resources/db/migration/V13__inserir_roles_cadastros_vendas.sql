INSERT INTO permissao VALUES (3, 'ROLE_CANCELAR_VENDA');
INSERT INTO permissao VALUES (4, 'ROLE_CADASTRAR_VENDA');
INSERT INTO permissao VALUES (5, 'ROLE_EXCLUIR_VENDA');

INSERT INTO permissao VALUES (6, 'ROLE_CADASTRAR_CERVEJA');
INSERT INTO permissao VALUES (7, 'ROLE_EXCLUIR_CERVEJA');

INSERT INTO permissao VALUES (8, 'ROLE_EXCLUIR_CIDADE');
INSERT INTO permissao VALUES (9, 'ROLE_EXCLUIR_USUARIO');

INSERT INTO permissao VALUES (10, 'ROLE_CADASTRAR_CLIENTE');
INSERT INTO permissao VALUES (11, 'ROLE_EXCLUIR_CLIENTE');

INSERT INTO permissao VALUES (12, 'ROLE_CADASTRAR_ESTILO');
INSERT INTO permissao VALUES (13, 'ROLE_EXCLUIR_ESTILO');

/*Permissoes grupo administrador ( 1 )*/
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 3);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 4);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 5);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 6);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 7);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 8);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 9);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 10);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 11);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 12);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 13);

/*Permissoes grupo vendedor ( 2 )*/
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (2, 3);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (2, 4);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (2, 5);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (2, 6);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (2, 10);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (2, 12);


