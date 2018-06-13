package top.qiaokeke.freess.domain;

public class SSObject {

    int V;
    int T;
    int U;
    int M;
    String address;
    String port;
    String password;
    String method;
    String time;
    String country;

    public SSObject() {
    }

    public SSObject(int v, int t, int u, int m, String address, String port, String password, String method, String time, String country) {
        V = v;
        T = t;
        U = u;
        M = m;
        this.address = address;
        this.port = port;
        this.password = password;
        this.method = method;
        this.time = time;
        this.country = country;
    }

    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public int getT() {
        return T;
    }

    public void setT(int t) {
        T = t;
    }

    public int getU() {
        return U;
    }

    public void setU(int u) {
        U = u;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "SSObject{" +
                "V=" + V +
                ", T=" + T +
                ", U=" + U +
                ", M=" + M +
                ", address='" + address + '\'' +
                ", port=" + port +
                ", password='" + password + '\'' +
                ", method='" + method + '\'' +
                ", time='" + time + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
