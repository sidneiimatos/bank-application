package io.github.sidneiimatos.bank_application.models.enums;

public enum AccountTypeEnum {
    USUARIO("Usuario"),
    LOJISTA("Lojista");

    private String typeName;

    AccountTypeEnum(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
