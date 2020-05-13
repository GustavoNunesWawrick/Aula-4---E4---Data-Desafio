
/**
 *
 * @author Gustavo Nunes Wawrick
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        dia = 0;
        mes = 0;
        ano = 0;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String obtemDataPadrao() {
        String padrao = dia + "/" + mes + "/" + ano;
        return padrao;
    }

    public int obtemDataInvertida() {
        int dataInvertida = ano * 10000 + mes * 100 + dia;
        return dataInvertida;
    }

}
