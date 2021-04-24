/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseProgra14;

/**
 *
 * @author Aaron
 */
public class Usuario {

    private String userld;
    private String passworld;
    private String loginstatus;
    private String registerdate;

    public boolean verifylogin() {
        return false;
    }

    public String getUserld() {
        return userld;
    }

    public void setUserld(String userld) {
        this.userld = userld;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(String loginstatus) {
        this.loginstatus = loginstatus;
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

}
