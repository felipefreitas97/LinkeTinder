class ArrayEmpresaTeste {
    boolean verificaArrayEmpresas(){
//Arrange
    List<PessoaFisica> ListaEmpresaTeste = []
    int resultadoEsperado = 2
    PessoaJuridica EmpresaTestA = new PessoaJuridica("A", "A", "123.456.789.01", "BR", "GO", "74123400", "descricao",["A"])
    PessoaJuridica EmpresaTestB = new PessoaJuridica("B", "B", "123.456.789.01", "BR", "GO", "74123400", "descricao",["B"])

    ListaEmpresaTeste << EmpresaTestA
    ListaEmpresaTeste << EmpresaTestB

    //Assert
    return (resultadoEsperado == ListaEmpresaTeste.size())
    }
}