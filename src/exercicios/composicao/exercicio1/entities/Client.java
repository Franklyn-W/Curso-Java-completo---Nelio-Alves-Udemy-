package exercicios.composicao.exercicio1.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getNameClient() {
        return name;
    }

    public void setNameClient(String name) {
        this.name = name;
    }

    public String getEmailClient() {
        return email;
    }

    public void setEmailClient(String email) {
        this.email = email;
    }

    public Date getBirthDateClient() {
        return birthDate;
    }

    public void setBirthDateClient(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        // Ex. saida - Luis (10/05/1993) - email@gmail.com
        return name + " (" + sdf.format(birthDate) + ") - " + email;
    }

}
