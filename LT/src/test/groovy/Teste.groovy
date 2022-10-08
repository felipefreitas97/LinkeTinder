import java.util.regex.*;

//Teste Construtores
PessoaFisicaTeste testePessoa = new PessoaFisicaTeste()
boolean resultadoPessoaTeste = testePessoa.verificaPessoa()
println("Teste Construtor Pessoa:" + resultadoPessoaTeste )

PessoaJuridicaTeste testeEmpresa = new PessoaJuridicaTeste()
boolean resultadoEmpresaTeste = testeEmpresa.verificaEmpresa()
println("Teste Construtor Empresa:" + resultadoEmpresaTeste )

//Teste Arrays
ArrayPessoaTeste testeArrayPessoa = new ArrayPessoaTeste()
boolean resultadoArrayPessoa = testeArrayPessoa.verificaArrayPessoas()
println("Teste Array Pessoa:" + resultadoArrayPessoa)

ArrayEmpresaTeste testeArrayEmpresa = new ArrayEmpresaTeste()
boolean resultadoArrayEmpresa = testeArrayEmpresa.verificaArrayEmpresas()
println("Teste Array Empresa:" + resultadoArrayEmpresa)

//Teste Validação CPF e CNPJ
static void main(String[] args) {
    String cpf = "712.200.200-34"
    String cpf2 = "71220020034"
    String cnpj = "18.472.121/0001-00"
    String cnpj2 = "18472121000100"
    String vazio = " "
    String cpffake = "3331112224"
    String cpffake2 = "333111222444"
    String cnpjfake = "1847212100010"
    String cnpjfake2 = "184721210001000"

    Pattern pattern = Pattern.compile(/^([0-9]{3}[.]?[0-9]{3}[.]?[0-9]{3}[-]?[0-9]{2}|[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2})$/)
    Matcher matcher = pattern.matcher(cpf)

    def match1 = cpf ==~ pattern
    def match2 = cpf2 ==~ pattern
    def match3 = cnpj ==~ pattern
    def match4 = cnpj2 ==~ pattern
    def match5 = vazio ==~ pattern
    def match6 = cpffake ==~ pattern
    def match7 = cpffake2 ==~ pattern
    def match8 = cnpjfake ==~ pattern
    def match9 = cnpjfake2 ==~ pattern

    /*println(match1)
    println(match2)
    println(match3)
    println(match4)
    println(match5)
    println(match6)
    println(match7)
    println(match8)
    println(match9)*/


}