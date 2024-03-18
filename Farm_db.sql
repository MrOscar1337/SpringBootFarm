PGDMP     ;    	                |            Farm_db    15.2    15.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16553    Farm_db    DATABASE     }   CREATE DATABASE "Farm_db" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Russia.1251';
    DROP DATABASE "Farm_db";
                postgres    false            �            1259    16652    employee    TABLE     �   CREATE TABLE public.employee (
    active boolean NOT NULL,
    id bigint NOT NULL,
    email character varying(255),
    first_name character varying(255),
    last_name character varying(255)
);
    DROP TABLE public.employee;
       public         heap    postgres    false            �            1259    16651    employee_id_seq    SEQUENCE     x   CREATE SEQUENCE public.employee_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.employee_id_seq;
       public          postgres    false    215                       0    0    employee_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.employee_id_seq OWNED BY public.employee.id;
          public          postgres    false    214            �            1259    16663    harvest    TABLE     �   CREATE TABLE public.harvest (
    date date,
    quantity double precision NOT NULL,
    employee_id bigint,
    id bigint NOT NULL,
    product_id bigint
);
    DROP TABLE public.harvest;
       public         heap    postgres    false            �            1259    16662    harvest_id_seq    SEQUENCE     w   CREATE SEQUENCE public.harvest_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.harvest_id_seq;
       public          postgres    false    217                       0    0    harvest_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.harvest_id_seq OWNED BY public.harvest.id;
          public          postgres    false    216            �            1259    16670    product    TABLE     z   CREATE TABLE public.product (
    id bigint NOT NULL,
    name character varying(255),
    unit character varying(255)
);
    DROP TABLE public.product;
       public         heap    postgres    false            �            1259    16669    product_id_seq    SEQUENCE     w   CREATE SEQUENCE public.product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.product_id_seq;
       public          postgres    false    219                       0    0    product_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.product_id_seq OWNED BY public.product.id;
          public          postgres    false    218            o           2604    16655    employee id    DEFAULT     j   ALTER TABLE ONLY public.employee ALTER COLUMN id SET DEFAULT nextval('public.employee_id_seq'::regclass);
 :   ALTER TABLE public.employee ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    215    215            p           2604    16666 
   harvest id    DEFAULT     h   ALTER TABLE ONLY public.harvest ALTER COLUMN id SET DEFAULT nextval('public.harvest_id_seq'::regclass);
 9   ALTER TABLE public.harvest ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    217    216    217            q           2604    16673 
   product id    DEFAULT     h   ALTER TABLE ONLY public.product ALTER COLUMN id SET DEFAULT nextval('public.product_id_seq'::regclass);
 9   ALTER TABLE public.product ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    218    219    219            	          0    16652    employee 
   TABLE DATA           L   COPY public.employee (active, id, email, first_name, last_name) FROM stdin;
    public          postgres    false    215   m                 0    16663    harvest 
   TABLE DATA           N   COPY public.harvest (date, quantity, employee_id, id, product_id) FROM stdin;
    public          postgres    false    217   �                 0    16670    product 
   TABLE DATA           1   COPY public.product (id, name, unit) FROM stdin;
    public          postgres    false    219   0                  0    0    employee_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.employee_id_seq', 6, true);
          public          postgres    false    214                       0    0    harvest_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.harvest_id_seq', 4, true);
          public          postgres    false    216                       0    0    product_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.product_id_seq', 8, true);
          public          postgres    false    218            s           2606    16661    employee employee_email_key 
   CONSTRAINT     W   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_email_key UNIQUE (email);
 E   ALTER TABLE ONLY public.employee DROP CONSTRAINT employee_email_key;
       public            postgres    false    215            u           2606    16659    employee employee_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.employee DROP CONSTRAINT employee_pkey;
       public            postgres    false    215            w           2606    16668    harvest harvest_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.harvest
    ADD CONSTRAINT harvest_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.harvest DROP CONSTRAINT harvest_pkey;
       public            postgres    false    217            y           2606    16677    product product_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.product DROP CONSTRAINT product_pkey;
       public            postgres    false    219            	   j   x�+�4�����sH�M���K���0�¶�.��0�bÅv�^�N#���̒d��/츰�b��&����\�q��bP�1gRfN��@Ż/�F56F��� �B�         9   x�3202�50�54�4�4�4�4�2�	�s��Y���YȂ�(d����� 	�C         o   x�]���PDϻUP�&D���cB&��HP���#�D�8���;O&2orA���od,t�è�dQv^����1�a�_:�0]��6nцEOV�v5wۗ�L�<���t�x�Vo     