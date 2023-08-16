package mz.uem.enums;


public enum ServicoEnum{

    REDES("REDES"),
    WIRELESS("WIRELESS"),
    CONSULTORIA("CONSULTORIA"),
    EMAIL("E-MAIL"),
    INTERNET("INTERNET"),
    HARDWARE("HARDWARE"),
    FORMACAO("FORMAÇÃO"),
    VÍDEO_CONFERÊNCIA("VÍDEO CONFERÊNCIA"),
    ALUGUER_DE_EQUIPAMENTOS("ALUGUER DE EQUIPAMENTOS"),
    WORKSHOP("WORKSHOP"),
    DOMAIN("DOMAIN"),
    SOFTWARE("SOFTWARE"),
    ANTI_VIRUS("ANTI-VIRUS"),
    DESENVOLVIMENTO_DE_SOFTWARE("DESENVOLVIMENTO DE SOFTWARE"),
    WEB_DESIGN_HOSPEDAGEM("WEB DESIGN ou HOSPEDAGEM");

    private String description;

    ServicoEnum(String descript){
        this.description=descript;
    }

    String getDescription(){
        return this.description;
    }

}