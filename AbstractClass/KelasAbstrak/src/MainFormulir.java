public class MainFormulir {
    public static void main(String[] args) {

        System.out.println();
        FormulirMahasiswa formulir01 = new FormulirMahasiswa();
        formulir01.Carabayar();
        formulir01.Tatatertib();

        System.out.println();
        FormulirDosen formulir02 = new FormulirDosen();
        formulir02.Carabayar();
        formulir02.Tatatertib();

        System.out.println();
        FormulirAdmin formulir03 = new FormulirAdmin();
        formulir03.Carabayar();
        formulir03.Tatatertib();

    }
}