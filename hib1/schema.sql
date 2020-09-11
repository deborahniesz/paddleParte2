
    create table CANCHAS (
        id_cancha bigint generated by default as identity (start with 1),
        esta_iluminada boolean,
        nombre varchar(255),
        cod_color_cod_color bigint,
        primary key (id_cancha)
    )

    create table COLORES (
        cod_color bigint not null,
        descripcion varchar(128),
        primary key (cod_color)
    )

    create table CONSTRUCTORES (
        cod_constructor bigint not null,
        domicilio varchar(255),
        nombre varchar(255),
        primary key (cod_constructor)
    )

    create table JUGADORES (
        id_jugador bigint generated by default as identity (start with 1),
        apellido varchar(255),
        domicilio varchar(255),
        nacimiento timestamp,
        nombre varchar(255),
        paleta_cod_paleta bigint,
        primary key (id_jugador)
    )

    create table PALETAS (
        cod_paleta bigint not null,
        grosor float,
        nombre varchar(255),
        cod_color_cod_color bigint,
        cod_constructor_cod_constructor bigint,
        primary key (cod_paleta)
    )

    create table PARTICIPACIONES (
        id_partido_id_partido bigint not null,
        id_jugador_id_jugador bigint not null,
        id_paleta_cod_paleta bigint,
        primary key (id_partido_id_partido, id_jugador_id_jugador)
    )

    create table PARTIDOS (
        id_partido bigint generated by default as identity (start with 1),
        fin_partido timestamp,
        inicio_partido timestamp,
        cod_color_cancha_cod_color bigint,
        id_cancha_id_cancha bigint,
        id_jugador_responsable_id_jugador bigint,
        primary key (id_partido)
    )

    alter table CANCHAS 
        add constraint FK_kgm9pftu3dql387fpcb7o2n1 
        foreign key (cod_color_cod_color) 
        references COLORES

    alter table JUGADORES 
        add constraint FK_1lmepddapl6bvv1g37q56yjra 
        foreign key (paleta_cod_paleta) 
        references PALETAS

    alter table PALETAS 
        add constraint FK_9exaa5e8mqgpq4tcxhj0ymyq0 
        foreign key (cod_color_cod_color) 
        references COLORES

    alter table PALETAS 
        add constraint FK_ltdnogk28tx2f7w3tmlj5gjdy 
        foreign key (cod_constructor_cod_constructor) 
        references CONSTRUCTORES

    alter table PARTICIPACIONES 
        add constraint FK_ctgqkso5vpcfy2rrdl7ut95q 
        foreign key (id_partido_id_partido) 
        references PARTIDOS

    alter table PARTICIPACIONES 
        add constraint FK_cih6hgxqmdc5sx5xp3980a94x 
        foreign key (id_jugador_id_jugador) 
        references JUGADORES

    alter table PARTICIPACIONES 
        add constraint FK_b5mink1naua8ct6ewqgqpipq4 
        foreign key (id_paleta_cod_paleta) 
        references PALETAS

    alter table PARTIDOS 
        add constraint FK_h9a6205vsbiug15fwr46jhyvq 
        foreign key (cod_color_cancha_cod_color) 
        references COLORES

    alter table PARTIDOS 
        add constraint FK_nbvg45qbwrhmuwo4ahlnvxn1o 
        foreign key (id_cancha_id_cancha) 
        references CANCHAS

    alter table PARTIDOS 
        add constraint FK_tm0ejelsap7xdelcl8j2f4xg1 
        foreign key (id_jugador_responsable_id_jugador) 
        references JUGADORES
