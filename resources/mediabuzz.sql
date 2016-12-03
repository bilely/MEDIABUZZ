CREATE DATABASE mediabuzz;
use mediabuzz;
  
#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Utilisateur
#------------------------------------------------------------

CREATE TABLE utilisateur(
        ID_user         int (11) Auto_increment  NOT NULL ,
        nom             Varchar (25) NOT NULL ,
        mail            Varchar (25) NOT NULL ,
        dateInscription TIMESTAMP NOT NULL ,
        mdp             Varchar (25) NOT NULL ,
        compteActif     Bool ,
        PRIMARY KEY (ID_user ) ,
        UNIQUE (nom ,mail )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: publication
#------------------------------------------------------------

CREATE TABLE publication(
        ID_publication  int (11) Auto_increment  NOT NULL ,
        auteur          Varchar (25) ,
        datePublication TIMESTAMP ,
        titre           Varchar (25) ,
        ID_user         Int NOT NULL ,
        PRIMARY KEY (ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Media
#------------------------------------------------------------

CREATE TABLE media(
        ID_media       int (11) Auto_increment  NOT NULL ,
        description    Varchar (25) NOT NULL ,
        nbVue          Int NOT NULL ,
        taille		   Int NOT NULL	,
        adresse		   Varchar(255) ,
        ID_publication Int NOT NULL ,
        PRIMARY KEY (ID_media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: MediaDynamique
#------------------------------------------------------------

CREATE TABLE mediaDynamique(
        ID_mediaDynamique int (11) Auto_increment  NOT NULL ,
        duree             Time NOT NULL ,
        ID_media          Int NOT NULL ,
        ID_publication    Int NOT NULL ,
        PRIMARY KEY (ID_mediaDynamique ,ID_media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: MediaStatique
#------------------------------------------------------------

CREATE TABLE mediaStatique(
        ID_mediaStatique int (11) Auto_increment  NOT NULL ,
        ID_media         Int NOT NULL ,
        ID_publication   Int NOT NULL ,
        PRIMARY KEY (ID_mediaStatique ,ID_media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Audio
#------------------------------------------------------------

CREATE TABLE audio(
        ID_audio          int (11) Auto_increment  NOT NULL ,
        ID_mediaDynamique Int NOT NULL ,
        ID_media          Int NOT NULL ,
        ID_publication    Int NOT NULL ,
        PRIMARY KEY (ID_audio ,ID_mediaDynamique ,ID_media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Video
#------------------------------------------------------------

CREATE TABLE video(
        Id_video          int (11) Auto_increment  NOT NULL ,
        ID_mediaDynamique Int NOT NULL ,
        ID_media          Int NOT NULL ,
        ID_publication    Int NOT NULL ,
        PRIMARY KEY (Id_video ,ID_mediaDynamique ,ID_media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Image
#------------------------------------------------------------

CREATE TABLE image(
        ID_image         int (11) Auto_increment  NOT NULL ,
        ID_mediaStatique Int NOT NULL ,
        ID_media         Int NOT NULL ,
        ID_publication   Int NOT NULL ,
        PRIMARY KEY (ID_image ,ID_mediaStatique ,ID_media ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Mail
#------------------------------------------------------------

CREATE TABLE mail(
        ID_mail      int (11) Auto_increment  NOT NULL ,
        destinataire Varchar (25) NOT NULL ,
        emetteur     Varchar (25) NOT NULL ,
        titre        Varchar (25) ,
        message      Varchar (25) ,
        ID_user      Int NOT NULL ,
        PRIMARY KEY (Id_mail )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: commentaire
#------------------------------------------------------------

CREATE TABLE commentaire(
        ID_commentaire int (11) Auto_increment  NOT NULL ,
        contenu        Varchar (300) ,
        ID_publication Int NOT NULL ,
        PRIMARY KEY (ID_commentaire ,ID_publication )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Alerte
#------------------------------------------------------------

CREATE TABLE alerte(
        ID_alerte      int (11) Auto_increment  NOT NULL ,
        dateAlerte     TIMESTAMP NOT NULL ,
        ID_publication Int NOT NULL ,
        PRIMARY KEY (ID_alerte )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Administrateur
#------------------------------------------------------------

CREATE TABLE administrateur(
        ID_admin int (11) Auto_increment  NOT NULL ,
        ID_user  Int NOT NULL ,
        PRIMARY KEY (ID_admin ,ID_user )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Tag
#------------------------------------------------------------

CREATE TABLE tag(
        ID_tag int (11) Auto_increment  NOT NULL ,
        nom    Varchar (25) NOT NULL ,
        PRIMARY KEY (ID_tag ) ,
        UNIQUE (nom )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Vote
#------------------------------------------------------------
 
CREATE TABLE vote(
        dateVote       TIMESTAMP NOT NULL ,
        enumTopFlop    Enum ("top","flop") ,
        ID_publication Int NOT NULL ,
        ID_tag         Int NOT NULL ,
        PRIMARY KEY (ID_publication ,ID_tag )
)ENGINE=InnoDB;

ALTER TABLE publication ADD CONSTRAINT FK_publication_ID_user FOREIGN KEY (ID_user) REFERENCES utilisateur(ID_user) ON DELETE CASCADE;
ALTER TABLE media ADD CONSTRAINT FK_media_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE mediaDynamique ADD CONSTRAINT FK_mediaDynamique_ID_media FOREIGN KEY (ID_media) REFERENCES media(ID_media) ON DELETE CASCADE;
ALTER TABLE mediaDynamique ADD CONSTRAINT FK_mediaDynamique_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE mediaStatique ADD CONSTRAINT FK_mediaStatique_ID_media FOREIGN KEY (ID_media) REFERENCES media(ID_media) ON DELETE CASCADE;
ALTER TABLE mediaStatique ADD CONSTRAINT FK_mediaStatique_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE audio ADD CONSTRAINT FK_audio_ID_mediaDynamique FOREIGN KEY (ID_mediaDynamique) REFERENCES mediaDynamique(ID_mediaDynamique) ON DELETE CASCADE;
ALTER TABLE audio ADD CONSTRAINT FK_audio_ID_media FOREIGN KEY (ID_media) REFERENCES media(ID_media) ON DELETE CASCADE;
ALTER TABLE audio ADD CONSTRAINT FK_audio_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE video ADD CONSTRAINT FK_video_ID_mediaDynamique FOREIGN KEY (ID_mediaDynamique) REFERENCES mediaDynamique(ID_mediaDynamique) ON DELETE CASCADE;
ALTER TABLE video ADD CONSTRAINT FK_video_ID_media FOREIGN KEY (ID_media) REFERENCES media(ID_media) ON DELETE CASCADE;
ALTER TABLE video ADD CONSTRAINT FK_video_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE image ADD CONSTRAINT FK_image_ID_mediaStatique FOREIGN KEY (ID_mediaStatique) REFERENCES mediaStatique(ID_mediaStatique) ON DELETE CASCADE;
ALTER TABLE image ADD CONSTRAINT FK_image_ID_media FOREIGN KEY (ID_media) REFERENCES media(ID_media) ON DELETE CASCADE;
ALTER TABLE image ADD CONSTRAINT FK_image_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE mail ADD CONSTRAINT FK_mail_ID_user FOREIGN KEY (ID_user) REFERENCES utilisateur(ID_user) ON DELETE CASCADE;
ALTER TABLE commentaire ADD CONSTRAINT FK_commentaire_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE alerte ADD CONSTRAINT FK_alerte_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE administrateur ADD CONSTRAINT FK_administrateur_ID_user FOREIGN KEY (ID_user) REFERENCES utilisateur(ID_user) ON DELETE CASCADE;
ALTER TABLE vote ADD CONSTRAINT FK_vote_ID_publication FOREIGN KEY (ID_publication) REFERENCES publication(ID_publication) ON DELETE CASCADE;
ALTER TABLE vote ADD CONSTRAINT FK_vote_ID_tag FOREIGN KEY (ID_tag) REFERENCES Tag(ID_tag) ON DELETE CASCADE;
