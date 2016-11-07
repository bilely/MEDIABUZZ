CREATE DATABASE mediabuzz;
use mediabuzz;
  
#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Utilisateur
#------------------------------------------------------------

CREATE TABLE Utilisateur(
        ID_User         int (11) Auto_increment  NOT NULL ,
        nom             Varchar (25) NOT NULL ,
        mail            Varchar (25) NOT NULL ,
        dateInscription Date NOT NULL ,
        mdp             Varchar (25) NOT NULL ,
        compteActif     Bool ,
        PRIMARY KEY (ID_User ) ,
        UNIQUE (nom ,mail )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Publication
#------------------------------------------------------------

CREATE TABLE Publication(
        ID_publication  int (11) Auto_increment  NOT NULL ,
        Auteur          Varchar (25) ,
        datePublication Date ,
        titre           Varchar (25) ,
        ID_User         Int NOT NULL ,
        PRIMARY KEY (ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Media
#------------------------------------------------------------

CREATE TABLE Media(
        ID_Media       int (11) Auto_increment  NOT NULL ,
        description    Varchar (25) NOT NULL ,
        tailleMax      Int NOT NULL ,
        nbMaxTag       Int NOT NULL ,
        nbVue          Int NOT NULL ,
        ID_publication Int NOT NULL ,
        PRIMARY KEY (ID_Media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: MediaDynamique
#------------------------------------------------------------

CREATE TABLE MediaDynamique(
        ID_mediaDynamique int (11) Auto_increment  NOT NULL ,
        duree             Time NOT NULL ,
        dureeMax          Time NOT NULL ,
        ID_Media          Int NOT NULL ,
        ID_publication    Int NOT NULL ,
        PRIMARY KEY (ID_mediaDynamique ,ID_Media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: mediaStatique
#------------------------------------------------------------

CREATE TABLE mediaStatique(
        ID_mediaStatique int (11) Auto_increment  NOT NULL ,
        tailleMax        Int ,
        ID_Media         Int NOT NULL ,
        ID_publication   Int NOT NULL ,
        PRIMARY KEY (ID_mediaStatique ,ID_Media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Audio
#------------------------------------------------------------

CREATE TABLE Audio(
        ID_audio          int (11) Auto_increment  NOT NULL ,
        ID_mediaDynamique Int NOT NULL ,
        ID_Media          Int NOT NULL ,
        ID_publication    Int NOT NULL ,
        PRIMARY KEY (ID_audio ,ID_mediaDynamique ,ID_Media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Video
#------------------------------------------------------------

CREATE TABLE Video(
        Id_Video          int (11) Auto_increment  NOT NULL ,
        ID_mediaDynamique Int NOT NULL ,
        ID_Media          Int NOT NULL ,
        ID_publication    Int NOT NULL ,
        PRIMARY KEY (Id_Video ,ID_mediaDynamique ,ID_Media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Image
#------------------------------------------------------------

CREATE TABLE Image(
        ID_Image         int (11) Auto_increment  NOT NULL ,
        ID_mediaStatique Int NOT NULL ,
        ID_Media         Int NOT NULL ,
        ID_publication   Int NOT NULL ,
        PRIMARY KEY (ID_Image ,ID_mediaStatique ,ID_Media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Mail
#------------------------------------------------------------

CREATE TABLE Mail(
        ID_Mail      int (11) Auto_increment  NOT NULL ,
        destinataire Varchar (25) NOT NULL ,
        emetteur     Varchar (25) NOT NULL ,
        titre        Varchar (25) ,
        message      Varchar (25) ,
        ID_User      Int NOT NULL ,
        PRIMARY KEY (ID_Mail )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Commentaire
#------------------------------------------------------------

CREATE TABLE Commentaire(
        ID_Commentaire int (11) Auto_increment  NOT NULL ,
        contenu        Varchar (300) ,
        ID_publication Int NOT NULL ,
        PRIMARY KEY (ID_Commentaire ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Alerte
#------------------------------------------------------------

CREATE TABLE Alerte(
        ID_Alerte      int (11) Auto_increment  NOT NULL ,
        dateAlerte     Date NOT NULL ,
        ID_publication Int NOT NULL ,
        PRIMARY KEY (ID_Alerte )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Administrateur
#------------------------------------------------------------

CREATE TABLE Administrateur(
        ID_Admin int (11) Auto_increment  NOT NULL ,
        ID_User  Int NOT NULL ,
        PRIMARY KEY (ID_Admin ,ID_User )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Tag
#------------------------------------------------------------

CREATE TABLE Tag(
        ID_Tag int (11) Auto_increment  NOT NULL ,
        nom    Varchar (25) NOT NULL ,
        PRIMARY KEY (ID_Tag ) ,
        UNIQUE (nom )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Vote
#------------------------------------------------------------
 
CREATE TABLE Vote(
        dateVote       Date NOT NULL ,
        enumTopFlop    Enum ("top","flop") ,
        ID_publication Int NOT NULL ,
        ID_Tag         Int NOT NULL ,
        PRIMARY KEY (ID_publication ,ID_Tag )
)ENGINE=InnoDB;

ALTER TABLE Publication ADD CONSTRAINT FK_Publication_ID_User FOREIGN KEY (ID_User) REFERENCES Utilisateur(ID_User);
ALTER TABLE Media ADD CONSTRAINT FK_Media_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE MediaDynamique ADD CONSTRAINT FK_MediaDynamique_ID_Media FOREIGN KEY (ID_Media) REFERENCES Media(ID_Media);
ALTER TABLE MediaDynamique ADD CONSTRAINT FK_MediaDynamique_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE mediaStatique ADD CONSTRAINT FK_mediaStatique_ID_Media FOREIGN KEY (ID_Media) REFERENCES Media(ID_Media);
ALTER TABLE mediaStatique ADD CONSTRAINT FK_mediaStatique_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE Audio ADD CONSTRAINT FK_Audio_ID_mediaDynamique FOREIGN KEY (ID_mediaDynamique) REFERENCES MediaDynamique(ID_mediaDynamique);
ALTER TABLE Audio ADD CONSTRAINT FK_Audio_ID_Media FOREIGN KEY (ID_Media) REFERENCES Media(ID_Media);
ALTER TABLE Audio ADD CONSTRAINT FK_Audio_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE Video ADD CONSTRAINT FK_Video_ID_mediaDynamique FOREIGN KEY (ID_mediaDynamique) REFERENCES MediaDynamique(ID_mediaDynamique);
ALTER TABLE Video ADD CONSTRAINT FK_Video_ID_Media FOREIGN KEY (ID_Media) REFERENCES Media(ID_Media);
ALTER TABLE Video ADD CONSTRAINT FK_Video_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE Image ADD CONSTRAINT FK_Image_ID_mediaStatique FOREIGN KEY (ID_mediaStatique) REFERENCES mediaStatique(ID_mediaStatique);
ALTER TABLE Image ADD CONSTRAINT FK_Image_ID_Media FOREIGN KEY (ID_Media) REFERENCES Media(ID_Media);
ALTER TABLE Image ADD CONSTRAINT FK_Image_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE Mail ADD CONSTRAINT FK_Mail_ID_User FOREIGN KEY (ID_User) REFERENCES Utilisateur(ID_User);
ALTER TABLE Commentaire ADD CONSTRAINT FK_Commentaire_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE Alerte ADD CONSTRAINT FK_Alerte_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE Administrateur ADD CONSTRAINT FK_Administrateur_ID_User FOREIGN KEY (ID_User) REFERENCES Utilisateur(ID_User);
ALTER TABLE Vote ADD CONSTRAINT FK_Vote_ID_publication FOREIGN KEY (ID_publication) REFERENCES Publication(ID_publication);
ALTER TABLE Vote ADD CONSTRAINT FK_Vote_ID_Tag FOREIGN KEY (ID_Tag) REFERENCES Tag(ID_Tag);