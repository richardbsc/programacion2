/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     28/2/2021 21:13:05                           */
/*==============================================================*/

/*==============================================================*/
/* Table: CLIENTE	                                        */
/*==============================================================*/
create table CLIENTE(
   ID_CLIENTE	        INT4                 not null,
   NOMBRE               VARCHAR(20)          not null,
   APELLIDO		VARCHAR(100)         not null,
   DIRECCION		VARCHAR(100)	     not null,
   CORREO 		VARCHAR(100)	     not null,
   TELEFONO		INT4 		     not null,	

   constraint PK_CLIENTE primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Index: CLIENTE_PK                                     */
/*==============================================================*/
create unique index CLIENTE_PK on CLIENTE (
ID_CLIENTE
);

/*==============================================================*/
/* Table: VENTA			                                */
/*==============================================================*/
create table VENTA (
   ID_VENTA	        INT4                 not null,
   ID_PROD	        INT4                 null,
   FECHA	        DATE                 null,
   ID_CLIENTE	        INT4                 null,
   ID_FACTURACION       INT4                 null,
   constraint PK_VENTA primary key (ID_VENTA)
);

/*==============================================================*/
/* Index: VENTA_PK                         */
/*==============================================================*/
create unique index VENTA_PK on VENTA (
ID_VENTA
);

/*==============================================================*/
/* Index: RELATIONSHIP_7_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_7_FK on VENTA(
ID_CLIENTE
);

/*==============================================================*/
/* Index: RELATIONSHIP_8_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_8_FK on FACTURACION(
ID_CLIENTE
);

/*==============================================================*/
/* Table: FACTURACION                                           */
/*==============================================================*/
create table FACTURACION (
   ID_FACTURACION       INT4                 not null,
   ID_CLIENTE		INT4                 null,
   ID_PRODUCTO		INT4                 null,
   PRECIO		INT4                 null,
   SUBTOTAL		INT4                 null,
   IVA			INT4                 null,
   TOTAL		INT4                 not null,
   FORMA_PAGO		VARCHAR(50)          not null,
   constraint PK_FACTURACION primary key (ID_FACTURACION)
);

/*==============================================================*/
/* Index: FACTURACION_PK                                        */
/*==============================================================*/
create unique index FACTURACION_PK on FACTURACION (
ID_FACTURACION
);

/*==============================================================*/
/* Index: RELATIONSHIP_5_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_5_FK on VENTA (
ID_FACTURACION
);

/*==============================================================*/
/* Index: RELATIONSHIP_16_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_16_FK on FACTURACION (
ID_CLIENTE
);

/*==============================================================*/
/* Index: RELATIONSHIP_18_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_18_FK on FACTURACION (
ID_CLIENTE
);



/*==============================================================*/
/* Table: PRODUCTO						*/
/*==============================================================*/
create table PRODUCTO(
   ID_PRODUCTO	        INT4                 not null,
   NOMBRE_PRODUCTO      VARCHAR(20)          not null,
   TIPO_PRODUCTO	VARCHAR(20)          not null,
   DESCRIPCION VARCHAR(50)          null,
   PRECIO		INT4                 not null,
   FECHA_VENCIMIENTO    DATE                 not null,
   constraint PK_PRODUCTO primary key (ID_PRODUCTO)
);

/*==============================================================*/
/* Index: PRODUCTO_PK                                       */
/*==============================================================*/
create unique index PRODUCTO_PK on PRODUCTO (
ID_PRODUCTO
);

/*==============================================================*/
/* Table: BODEGA	                                       */
/*==============================================================*/
create table BODEGA(
   ID_BODEGA	        INT4                 not null,
   STOCK                VARCHAR(20)          not null,
   DESCRIPCION          VARCHAR(100)         null,
   ID_PRODUCTO          INT4                 null,
   PRECIO		INT4                 null,
   TIPO_PRODUCTO        INT4                 null,
   constraint PK_BODEGA primary key (ID_BODEGA)
);

/*==============================================================*/
/* Index: BODEGA_PK	                                        */
/*==============================================================*/
create unique index BODEGA_PK on BODEGA (
ID_BODEGA
);

alter table BODEGA
   add constraint FK_BODEGA_RELATIONS_PRODUCTO foreign key (ID_PRODUCTO)
      references PRODUCTO (ID_PRODUCTO)
      on delete restrict on update restrict;

alter table PRODUCTO
   add constraint FK_VENTA_RELATIONS_PRODUCTO foreign key (ID_PRODUCTO)
      references PRODUCTO (ID_PRODUCTO)
      on delete restrict on update restrict;

alter table FACTURACION
   add constraint FK_FACTURACION_RELATIONS_VENTA foreign key (ID_VENTA)
      references VENTA (ID_VENTA)
      on delete restrict on update restrict;

alter table CLIENTE
   add constraint FK_CLIENTE_RELATIONS_VENTA foreign key (ID_VENTA)
      references VENTA (ID_VENTA)
      on delete restrict on update restrict;

alter table CLIENTE
   add constraint FK_CLIENTE_RELATIONS_FACTURACION foreign key (ID_FACTURACION)
      references FACTURACION (ID_FACTURACION)
      on delete restrict on update restrict;

