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
INSERT INTO image (title, url_image) VALUES ('Audi Q3 - Frontal', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Audi+Q3+E-tron/Audi-Q3-E-tron-frente.png');
INSERT INTO image (title, url_image) VALUES ('Audi Q3 - Fundo', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Audi+Q3+E-tron/Audi-Q3-E-tron-fundo.jpg');
INSERT INTO image (title, url_image) VALUES ('Audi Q3 - Interno 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Audi+Q3+E-tron/Audi-Q3-E-tron-interno-1.jpg');
INSERT INTO image (title, url_image) VALUES ('Audi Q3 - Interno 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Audi+Q3+E-tron/Audi-Q3-E-tron-interno-2.jpg');
INSERT INTO image (title, url_image) VALUES ('Audi Q3 - Interno 03', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Audi+Q3+E-tron/Audi-Q3-E-tron-interno-3.jpg');
INSERT INTO image (title, url_image) VALUES ('Audi Q3 - Interno 04', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Audi+Q3+E-tron/Audi-Q3-E-tron-interno-4.jpg');

-- BMW M2
INSERT INTO image (title, url_image) VALUES ('BMW M2 - Frontal', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/BMW+M2+Competition/BMW-M2-Competion-frente.png');
INSERT INTO image (title, url_image) VALUES ('BMW M2 - Fundo', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/BMW+M2+Competition/BMW-M2-Competion-fundo.png');
INSERT INTO image (title, url_image) VALUES ('BMW M2 - Interno 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/BMW+M2+Competition/BMW-M2-Competion-interno1.png');
INSERT INTO image (title, url_image) VALUES ('BMW M2 - Interno 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/BMW+M2+Competition/BMW-M2-Competion-interno2.jpg');
INSERT INTO image (title, url_image) VALUES ('BMW M2 - Interno 03', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/BMW+M2+Competition/BMW-M2-Competion-interno3.jpg');
INSERT INTO image (title, url_image) VALUES ('BMW M2 - Interno 04', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/BMW+M2+Competition/BMW-M2-Competion-interno4.png');

-- Jeep Compass
INSERT INTO image (title, url_image) VALUES ('Jeep Compass - Frontal', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Jeep+Compass/Jeep-Compass-frente.png.png');
INSERT INTO image (title, url_image) VALUES ('Jeep Compass - Teto', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Jeep+Compass/Jeep-Compass-tetosolar.jpg');
INSERT INTO image (title, url_image) VALUES ('Jeep Compass - Interno 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Jeep+Compass/Jeep-Compass-interno1.jpg');
INSERT INTO image (title, url_image) VALUES ('Jeep Compass - Interno 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Jeep+Compass/Jeep-Compass-interno2.jpg');
INSERT INTO image (title, url_image) VALUES ('Jeep Compass - Interno 03', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Jeep+Compass/Jeep-Compass-interno3.jpg');
INSERT INTO image (title, url_image) VALUES ('Jeep Compass - Interno 04', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Jeep+Compass/Jeep-Compass-interno4.jpg');

-- Mercedes-Benz C300
INSERT INTO image (title, url_image) VALUES ('Mercedes-Benz C300 - Frontal', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Mercedes+Benz+C+300/Mercedes-Benz-C-300.png');
INSERT INTO image (title, url_image) VALUES ('Mercedes-Benz C300 - Fundo', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Mercedes+Benz+C+300/Mercedes-Benz-Classe-C+fundo.jpeg');
INSERT INTO image (title, url_image) VALUES ('Mercedes-Benz C300 - Interno 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Mercedes+Benz+C+300/Mercedes-Benz-Classe-C+interno1.jpeg');
INSERT INTO image (title, url_image) VALUES ('Mercedes-Benz C300 - Interno 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Mercedes+Benz+C+300/Mercedes-Benz-Classe-C+interno2.jpeg');
INSERT INTO image (title, url_image) VALUES ('Mercedes-Benz C300 - Interno 03', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Mercedes+Benz+C+300/Mercedes-Benz-Classe-C+interno3.jpeg');
INSERT INTO image (title, url_image) VALUES ('Mercedes-Benz C300 - Interno 04', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Mercedes+Benz+C+300/Mercedes-Benz-Classe-C+interno4.jpeg');

-- Peugeot 208 e-GT
INSERT INTO image (title, url_image) VALUES ('Peugeot 208 e-GT - Frontal', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Peugeot+e-208+GT/Peugeot-e-208-GT-frente.jpg.png');
INSERT INTO image (title, url_image) VALUES ('Peugeot 208 e-GT - Carregamento', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Peugeot+e-208+GT/Peugeot-e-208-GT-fundo.jpg');
INSERT INTO image (title, url_image) VALUES ('Peugeot 208 e-GT - Interno 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Peugeot+e-208+GT/Peugeot-e-208-GT-interno1.jpg');
INSERT INTO image (title, url_image) VALUES ('Peugeot 208 e-GT - Interno 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Peugeot+e-208+GT/Peugeot-e-208-GT-interno2.jpg');
INSERT INTO image (title, url_image) VALUES ('Peugeot 208 e-GT - Interno 03', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Peugeot+e-208+GT/Peugeot-e-208-GT-interno3.jpg');
INSERT INTO image (title, url_image) VALUES ('Peugeot 208 e-GT - Funcionamento', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Peugeot+e-208+GT/Peugeot-e-208-GT-modo.jpg');

-- Porsche 911 Carreira
INSERT INTO image (title, url_image) VALUES ('Porsche 911 Carreira - Frontal', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Porsche+911+Carreira/Porsche-911-Carreira-frente.png');
INSERT INTO image (title, url_image) VALUES ('Porsche 911 Carreira - Lateral', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Porsche+911+Carreira/Porsche-911-Carreira-lateral.png');
INSERT INTO image (title, url_image) VALUES ('Porsche 911 Carreira - Fundo', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Porsche+911+Carreira/Porsche-911-Carreira-fundo.png');
INSERT INTO image (title, url_image) VALUES ('Porsche 911 Carreira - Interno 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Porsche+911+Carreira/Porsche-911-Carreira-interno1.png');
INSERT INTO image (title, url_image) VALUES ('Porsche 911 Carreira - Interno 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Porsche+911+Carreira/Porsche-911-Carreira-interno2.png');
INSERT INTO image (title, url_image) VALUES ('Porsche 911 Carreira - Interno 03', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Porsche+911+Carreira/Porsche-911-Carreira-interno3.jpg');

-- Range Rover Evoque
INSERT INTO image (title, url_image) VALUES ('Range Rover Evoque - Frontal 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Range+Rover+Evoque/Range-Rover-Evoque-frente1.png');
INSERT INTO image (title, url_image) VALUES ('Range Rover Evoque - Frontal 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Range+Rover+Evoque/Range-Rover-Evoque-frente2.jpg');
INSERT INTO image (title, url_image) VALUES ('Range Rover Evoque - Lateral', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Range+Rover+Evoque/Range-Rover-Evoque-lateral.jpg');
INSERT INTO image (title, url_image) VALUES ('Range Rover Evoque - Interno 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Range+Rover+Evoque/Range-Rover-Evoque-interno1.jpg');
INSERT INTO image (title, url_image) VALUES ('Range Rover Evoque - Interno 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Range+Rover+Evoque/Range-Rover-Evoque-interno2.jpg');
INSERT INTO image (title, url_image) VALUES ('Range Rover Evoque - Interno 03', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Range+Rover+Evoque/Range-Rover-Evoque-interno3.jpg');

-- Rolls Royce Phantom
INSERT INTO image (title, url_image) VALUES ('Rolls Royce Phantom - Frontal', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Rolls+Royce+Phantom/Rolls-Royce-Phantom-frente.png');
INSERT INTO image (title, url_image) VALUES ('Rolls Royce Phantom - Interno 01', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Rolls+Royce+Phantom/Rolls-Royce-Phantom-Interno01.jpg');
INSERT INTO image (title, url_image) VALUES ('Rolls Royce Phantom - Interno 02', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Rolls+Royce+Phantom/Rolls-Royce-Phantom-Interno02.jpg');
INSERT INTO image (title, url_image) VALUES ('Rolls Royce Phantom - Interno 03', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Rolls+Royce+Phantom/Rolls-Royce-Phantom-Interno03.jpg');
INSERT INTO image (title, url_image) VALUES ('Rolls Royce Phantom - Interno 04', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Rolls+Royce+Phantom/Rolls-Royce-Phantom-Interno04.jpg');
INSERT INTO image (title, url_image) VALUES ('Rolls Royce Phantom - Interno 05', 'https://pi-group01-gocar-bucket.s3.amazonaws.com/Banco+de+fotos/Rolls+Royce+Phantom/Rolls-Royce-Phantom-Interno05.jpg');

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

-- User
--INSERT INTO usuario (name, lastname, login, password) VALUES ('aila','torres','aila@gmail.com', '312456789');
--INSERT INTO AppUser (name, username, email, password, appUserRoles ) VALUES ('aila','torres','aila@gmail.com', '312456789', 'ROLE_USER');

--  private String name;
--    private String username;
--    private String email;
--    private String password;
--    @Enumerated(EnumType.STRING)
--    private AppUserRoles appUserRoles;