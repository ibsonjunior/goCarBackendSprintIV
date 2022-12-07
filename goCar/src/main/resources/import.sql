-- Categories
INSERT INTO category (qualification, description, url_image) VALUES ('Esportivos', 'Foco no desempenho dinâmico para o condutor, além de uma velocidade acima da média de outros veículos e com muita liberdade para dirigir', 'https://s2.glbimg.com/k48rKSt1_iM35y4_UUWk8tp3AAA=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2018/B/5/PTZY4TStiTFosuj11llg/mercedes-amg-gt-4-02ca02280c1f083b.jpg');
INSERT INTO category (qualification, description, url_image) VALUES ('Elétricos', 'Carros elétricos não são movidos a base de combustão, e são exelentes para quem se preocupa meio-ambiente.', 'https://andreveiculos.com.br/blog/wp-content/uploads/2020/02/porsche-taycan.jpg');
INSERT INTO category (qualification, description, url_image) VALUES ('Luxo', 'O termo luxo é usado para categorizar veículos que estão equipados com melhores capacidades de desempenho, interiores luxuosos e todos os últimos recursos de segurança e tecnologia', 'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2018-rolls-royce-phantom-1536152159.png');
INSERT INTO category (qualification, description, url_image) VALUES ('SUV', 'A sigla SUV significa Sport Utility Vehicle -- ou seja, veículo utilitário esportivo. As SUVs costumam ter porte avantajado, além de interior espaçoso e possibilidade de trafegar dentro e fora da cidade.', 'https://i0.wp.com/replicario.com.br/wp-content/uploads/2020/10/cadillac_2021_escalade_0397.jpg?fit=1200%2C628&ssl=1');

-- Cities
INSERT INTO city (name, country) VALUES ('Sorocaba', 'Brasil');
INSERT INTO city (name, country) VALUES ('Campinas', 'Brasil');
INSERT INTO city (name, country) VALUES ('São Paulo', 'Brasil');
INSERT INTO city (name, country) VALUES ('Recife', 'Brasil');
INSERT INTO city (name, country) VALUES ('Salvador', 'Brasil');

-- Products
INSERT INTO product (name, description, id_category, id_city) VALUES ('Rolls Royce Phantom', 'O Phantom é o sedan de grande porte da marca Rolls-Royce. O modelo é equipado com motor V12...', 3, 1);
INSERT INTO product (name, description, id_category, id_city) VALUES ('Range Rover Evoque', 'Range Rover Evoque é um esportivo compacto da marca Land Rover. Seu design e potência são os...', 1, 1);
INSERT INTO product (name, description, id_category, id_city) VALUES ('Porsche 911 Carreira','A silhueta do 911 Carrera é inconfundível, tem o DNA da marca Porsche desde 1963 tanto no design...', 1, 2);
INSERT INTO product (name, description, id_category, id_city) VALUES ('Jeep Compass','Jeep Compass é um grande colecionador de prêmios, eleito “Melhor Compra do Ano” na categoria SUV Premium...', 4, 4);
INSERT INTO product (name, description, id_category, id_city) VALUES ('Peugeot 208 e-GT','Experimente um novo nível de mobilidade com o Peugeot 208-e, número #1 na categoria de compactos elétricos', 2, 2);
INSERT INTO product (name, description, id_category, id_city) VALUES ('Mercedes-Benz C300','Design único, tecnologia, conforto e potência definem a essência do Mercedes-Benz C300', 3, 3);
INSERT INTO product (name, description, id_category, id_city) VALUES ('BMW M2 Competition','Fabricado em Leipzig, na Alemanha, o BMW M2 é importado ao Brasil em versão única Competition...', 1, 3);
INSERT INTO product (name, description, id_category, id_city) VALUES ('Audi Q3 E-tron','Um SUV para toda a família, o Audi Q3 possui uma presença imponente, com bastante espaço interno...', 4, 4);

-- Features
INSERT INTO feature (name, icon) VALUES ('Ar-condicionado', 'https://cdn-icons-png.flaticon.com/512/5557/5557951.png');
INSERT INTO feature (name, icon) VALUES ('Blindagem', 'https://cdn-icons-png.flaticon.com/512/8796/8796826.png');
INSERT INTO feature (name, icon) VALUES ('4 portas', 'https://cdn-icons-png.flaticon.com/512/8664/8664896.png');
INSERT INTO feature (name, icon) VALUES ('Direção hidraulica', 'https://cdn-icons-png.flaticon.com/512/1723/1723597.png');
INSERT INTO feature (name, icon) VALUES ('Air bag', 'https://cdn-icons-png.flaticon.com/512/1793/1793065.png');
INSERT INTO feature (name, icon) VALUES ('ABS', 'https://cdn-icons-png.flaticon.com/512/638/638416.png');
INSERT INTO feature (name, icon) VALUES ('Mala Grande', 'https://cdn-icons-png.flaticon.com/512/7112/7112353.png');
INSERT INTO feature (name, icon) VALUES ('Vidro Eletrico', 'https://cdn-icons-png.flaticon.com/512/2061/2061890.png');
INSERT INTO feature (name, icon) VALUES ('Trava Elétrica', 'https://cdn-icons-png.flaticon.com/512/7142/7142859.png');
INSERT INTO feature (name, icon) VALUES ('Câmbio Automático', 'https://cdn-icons-png.flaticon.com/512/4805/4805737.png');

-- Images
-- Audi Q3
INSERT INTO image (title, url_image, id_product) VALUES ('Audi Q3 - Frontal', 'https://live.staticflickr.com/65535/52488108356_ca9170be35_b.jpg', 8);
INSERT INTO image (title, url_image, id_product) VALUES ('Audi Q3 - Fundo', 'https://live.staticflickr.com/65535/52488417129_5cf37379f7_k.jpg', 8);
INSERT INTO image (title, url_image, id_product) VALUES ('Audi Q3 - Interno 01', 'https://live.staticflickr.com/65535/52487612037_cb1394543e_b.jpg', 8);
INSERT INTO image (title, url_image, id_product) VALUES ('Audi Q3 - Interno 02', 'https://live.staticflickr.com/65535/52488108386_53c3476cb3_h.jpg', 8);
INSERT INTO image (title, url_image, id_product) VALUES ('Audi Q3 - Interno 03', 'https://live.staticflickr.com/65535/52488108366_ba4627d90a_c.jpg', 8);
INSERT INTO image (title, url_image, id_product) VALUES ('Audi Q3 - Interno 04', 'https://live.staticflickr.com/65535/52488384804_f7ce58ce1c_b.jpg', 8);

-- BMW M2
INSERT INTO image (title, url_image, id_product) VALUES ('BMW M2 - Frontal', 'https://live.staticflickr.com/65535/52488657338_55ba5167d2_k.jpg', 7);
INSERT INTO image (title, url_image, id_product) VALUES ('BMW M2 - Fundo', 'https://live.staticflickr.com/65535/52487611977_fd5c39b218_h.jpg', 7);
INSERT INTO image (title, url_image, id_product) VALUES ('BMW M2 - Interno 01', 'https://live.staticflickr.com/65535/52488108306_1e0832f7a3.jpg', 7);
INSERT INTO image (title, url_image, id_product) VALUES ('BMW M2 - Interno 02', 'https://live.staticflickr.com/65535/52488657378_63d19195e6_k.jpg', 7);
INSERT INTO image (title, url_image, id_product) VALUES ('BMW M2 - Interno 03', 'https://live.staticflickr.com/65535/52488574975_28591a4922_z.jpg', 7);
INSERT INTO image (title, url_image, id_product) VALUES ('BMW M2 - Interno 04', 'https://live.staticflickr.com/65535/52487611937_a956ecc35f_z.jpg', 7);

-- Jeep Compass
INSERT INTO image (title, url_image, id_product) VALUES ('Jeep Compass - Frontal', 'https://live.staticflickr.com/65535/52487611812_10675967cc_k.jpg', 4);
INSERT INTO image (title, url_image, id_product) VALUES ('Jeep Compass - Teto', 'https://live.staticflickr.com/65535/52488384689_5113769683_h.jpg', 4);
INSERT INTO image (title, url_image, id_product) VALUES ('Jeep Compass - Interno 01', 'https://live.staticflickr.com/65535/52488384659_d17171f621_h.jpg', 4);
INSERT INTO image (title, url_image, id_product) VALUES ('Jeep Compass - Interno 02', 'https://live.staticflickr.com/65535/52488384679_81e9512f0a_h.jpg', 4);
INSERT INTO image (title, url_image, id_product) VALUES ('Jeep Compass - Interno 03', 'https://live.staticflickr.com/65535/52488108176_7e64f61c68_h.jpg', 4);
INSERT INTO image (title, url_image, id_product) VALUES ('Jeep Compass - Interno 04', 'https://live.staticflickr.com/65535/52488384649_d478f065f5_h.jpg', 4);

-- Mercedes-Benz C300
INSERT INTO image (title, url_image, id_product) VALUES ('Mercedes-Benz C300 - Frontal', 'https://live.staticflickr.com/65535/52488384609_8394664a51_k.jpg', 6);
INSERT INTO image (title, url_image, id_product) VALUES ('Mercedes-Benz C300 - Fundo', 'https://live.staticflickr.com/65535/52488683299_3e2850de2a_z.jpg', 6);
INSERT INTO image (title, url_image, id_product) VALUES ('Mercedes-Benz C300 - Interno 01', 'https://live.staticflickr.com/65535/52488657243_dd6224e54b_k.jpg', 6);
INSERT INTO image (title, url_image, id_product) VALUES ('Mercedes-Benz C300 - Interno 02', 'https://live.staticflickr.com/65535/52488108121_b179e20bb3_b.jpg', 6);
INSERT INTO image (title, url_image, id_product) VALUES ('Mercedes-Benz C300 - Interno 03', 'https://live.staticflickr.com/65535/52488406676_a3555ef998_z.jpg', 6);
INSERT INTO image (title, url_image, id_product) VALUES ('Mercedes-Benz C300 - Interno 04', 'https://live.staticflickr.com/65535/52487911977_5acaaaa573_z.jpg', 6);

-- Peugeot 208 e-GT
INSERT INTO image (title, url_image, id_product) VALUES ('Peugeot 208 e-GT - Frontal', 'https://live.staticflickr.com/65535/52488384484_85408acd5b_k.jpg', 5);
INSERT INTO image (title, url_image, id_product) VALUES ('Peugeot 208 e-GT - Carregamento', 'https://live.staticflickr.com/65535/52488108071_957d7d6bc0_h.jpg', 5);
INSERT INTO image (title, url_image, id_product) VALUES ('Peugeot 208 e-GT - Interno 01', 'https://live.staticflickr.com/65535/52488686128_3f177a9fe5_k.jpg', 5);
INSERT INTO image (title, url_image, id_product) VALUES ('Peugeot 208 e-GT - Interno 02', 'https://live.staticflickr.com/65535/52488647825_099717d075_k.jpg', 5);
INSERT INTO image (title, url_image, id_product) VALUES ('Peugeot 208 e-GT - Interno 03', 'https://live.staticflickr.com/65535/52488657113_6ee1ac4544_h.jpg', 5);
INSERT INTO image (title, url_image, id_product) VALUES ('Peugeot 208 e-GT - Funcionamento', 'https://live.staticflickr.com/65535/52487611712_3177ae32d8_b.jpg', 5);

-- Porsche 911 Carreira
INSERT INTO image (title, url_image, id_product) VALUES ('Porsche 911 Carreira - Frontal', 'https://live.staticflickr.com/65535/52488574540_4cbbb61b72_b.jpg', 3);
INSERT INTO image (title, url_image, id_product) VALUES ('Porsche 911 Carreira - Lateral', 'https://live.staticflickr.com/65535/52488384364_ca8f7d9879_h.jpg', 3);
INSERT INTO image (title, url_image, id_product) VALUES ('Porsche 911 Carreira - Fundo', 'https://live.staticflickr.com/65535/52488108006_f4e70dd2f1_h.jpg', 3);
INSERT INTO image (title, url_image, id_product) VALUES ('Porsche 911 Carreira - Interno 01', 'https://live.staticflickr.com/65535/52487611637_4c76d95afa_h.jpg', 3);
INSERT INTO image (title, url_image, id_product) VALUES ('Porsche 911 Carreira - Interno 02', 'https://live.staticflickr.com/65535/52488574650_e57cf4aaa4_h.jpg', 3);
INSERT INTO image (title, url_image, id_product) VALUES ('Porsche 911 Carreira - Interno 03', 'https://live.staticflickr.com/65535/52488384354_f8602489d0_h.jpg', 3);

-- Range Rover Evoque
INSERT INTO image (title, url_image, id_product) VALUES ('Range Rover Evoque - Frontal 01', 'https://live.staticflickr.com/65535/52488574430_a69bbeddd5_k.jpg', 2);
INSERT INTO image (title, url_image, id_product) VALUES ('Range Rover Evoque - Frontal 02', 'https://live.staticflickr.com/65535/52488384224_32ed3bd28c_k.jpg', 2);
INSERT INTO image (title, url_image, id_product) VALUES ('Range Rover Evoque - Lateral', 'https://live.staticflickr.com/65535/52488107921_5a22bcbe12_k.jpg', 2);
INSERT INTO image (title, url_image, id_product) VALUES ('Range Rover Evoque - Interno 01', 'https://live.staticflickr.com/65535/52488384324_887eb1febf_h.jpg', 2);
INSERT INTO image (title, url_image, id_product) VALUES ('Range Rover Evoque - Interno 02', 'https://live.staticflickr.com/65535/52488107931_e4a4c28fec_h.jpg', 2);
INSERT INTO image (title, url_image, id_product) VALUES ('Range Rover Evoque - Interno 03', 'https://live.staticflickr.com/65535/52488574495_be57bbc6dd_k.jpg', 2);

-- Rolls Royce Phantom
INSERT INTO image (title, url_image, id_product) VALUES ('Rolls Royce Phantom - Frontal', 'https://live.staticflickr.com/65535/52488574405_bc82fda75c_k.jpg', 1);
INSERT INTO image (title, url_image, id_product) VALUES ('Rolls Royce Phantom - Interno 01', 'https://live.staticflickr.com/65535/52487611412_ae6dbf0d18_b.jpg', 1);
INSERT INTO image (title, url_image, id_product) VALUES ('Rolls Royce Phantom - Interno 02', 'https://live.staticflickr.com/65535/52488574335_d8fa9ee77e_b.jpg', 1);
INSERT INTO image (title, url_image, id_product) VALUES ('Rolls Royce Phantom - Interno 03', 'https://live.staticflickr.com/65535/52488656863_ecb9bed5d7_k.jpg', 1);
INSERT INTO image (title, url_image, id_product) VALUES ('Rolls Royce Phantom - Interno 04', 'https://live.staticflickr.com/65535/52488656893_ebed63acc9_h.jpg', 1);
INSERT INTO image (title, url_image, id_product) VALUES ('Rolls Royce Phantom - Interno 05', 'https://live.staticflickr.com/65535/52488574365_966c840300_h.jpg', 1);

-- Relacionamento entre as tabelas Product e Feature
-- Rolls Royce Phantom
INSERT INTO product_feature (id_product, id_feature) VALUES (1,1);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,2);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,3);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,4);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,5);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,6);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,7);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,8);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,9);
INSERT INTO product_feature (id_product, id_feature) VALUES (1,10);

-- Range Rover Evoque
INSERT INTO product_feature (id_product, id_feature) VALUES (2,1);
INSERT INTO product_feature (id_product, id_feature) VALUES (2,3);
INSERT INTO product_feature (id_product, id_feature) VALUES (2,4);
INSERT INTO product_feature (id_product, id_feature) VALUES (2,5);
INSERT INTO product_feature (id_product, id_feature) VALUES (2,6);
INSERT INTO product_feature (id_product, id_feature) VALUES (2,7);
INSERT INTO product_feature (id_product, id_feature) VALUES (2,8);
INSERT INTO product_feature (id_product, id_feature) VALUES (2,9);
INSERT INTO product_feature (id_product, id_feature) VALUES (2,10);

-- Porsche 911 Carreira
INSERT INTO product_feature (id_product, id_feature) VALUES (3,4);
INSERT INTO product_feature (id_product, id_feature) VALUES (3,5);
INSERT INTO product_feature (id_product, id_feature) VALUES (3,6);
INSERT INTO product_feature (id_product, id_feature) VALUES (3,8);
INSERT INTO product_feature (id_product, id_feature) VALUES (3,9);

-- Jeep Compass
INSERT INTO product_feature (id_product, id_feature) VALUES (4,1);
INSERT INTO product_feature (id_product, id_feature) VALUES (4,3);
INSERT INTO product_feature (id_product, id_feature) VALUES (4,4);
INSERT INTO product_feature (id_product, id_feature) VALUES (4,5);
INSERT INTO product_feature (id_product, id_feature) VALUES (4,6);
INSERT INTO product_feature (id_product, id_feature) VALUES (4,7);
INSERT INTO product_feature (id_product, id_feature) VALUES (4,8);
INSERT INTO product_feature (id_product, id_feature) VALUES (4,9);

-- Peugeot 208 e-GT
INSERT INTO product_feature (id_product, id_feature) VALUES (5,1);
INSERT INTO product_feature (id_product, id_feature) VALUES (5,3);
INSERT INTO product_feature (id_product, id_feature) VALUES (5,4);
INSERT INTO product_feature (id_product, id_feature) VALUES (5,5);
INSERT INTO product_feature (id_product, id_feature) VALUES (5,6);
INSERT INTO product_feature (id_product, id_feature) VALUES (5,7);
INSERT INTO product_feature (id_product, id_feature) VALUES (5,8);
INSERT INTO product_feature (id_product, id_feature) VALUES (5,9);

-- Mercedes-Benz C300
INSERT INTO product_feature (id_product, id_feature) VALUES (6,1);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,2);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,3);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,4);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,5);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,6);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,7);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,8);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,9);
INSERT INTO product_feature (id_product, id_feature) VALUES (6,10);

-- BMW M2 Competition
INSERT INTO product_feature (id_product, id_feature) VALUES (7,4);
INSERT INTO product_feature (id_product, id_feature) VALUES (7,5);
INSERT INTO product_feature (id_product, id_feature) VALUES (7,6);
INSERT INTO product_feature (id_product, id_feature) VALUES (7,9);

-- Audi Q3 E-tron
INSERT INTO product_feature (id_product, id_feature) VALUES (8,1);
INSERT INTO product_feature (id_product, id_feature) VALUES (8,3);
INSERT INTO product_feature (id_product, id_feature) VALUES (8,4);
INSERT INTO product_feature (id_product, id_feature) VALUES (8,5);
INSERT INTO product_feature (id_product, id_feature) VALUES (8,6);
INSERT INTO product_feature (id_product, id_feature) VALUES (8,7);
INSERT INTO product_feature (id_product, id_feature) VALUES (8,8);
INSERT INTO product_feature (id_product, id_feature) VALUES (8,9);

-- Roles
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');


--Booking
--INSERT INTO Booking(initialTime, initalDay, finalDay) VALUES('1322123', '546456645', '978798546');