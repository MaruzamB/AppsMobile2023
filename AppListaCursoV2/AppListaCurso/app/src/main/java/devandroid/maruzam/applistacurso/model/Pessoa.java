package devandroid.maruzam.applistacurso.model;

public class Pessoa {

    private String promeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    public Pessoa (){}

    public String getPromeiroNome() {
        return promeiroNome;
    }

    public void setPromeiroNome(String promeiroNome) {
        this.promeiroNome = promeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "promeiroNome='" + promeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
