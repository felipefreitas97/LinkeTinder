
class PessoaFisica extends Pessoa{
    String cpf,idade
    def competenciaPessoa

    def setCompetenciaPessoa (Competencia){
        competenciaPessoa = Competencia
    }

    PessoaFisica(String nome, String email, String cpf, String idade, String estado, String cep, String descricao,ArrayList<String> competenciaPessoa){
        super(nome,email,estado,cep,descricao)
        this.nome = nome
        this.cpf = cpf
        this.estado = estado
        this.cep = cep
        this.idade = idade
        this.descricao = descricao
        this.competenciaPessoa = competenciaPessoa

    }


    @Override
    String toString (){
        return """Nome:${nome}
Email:${email}
CPF:${cpf}
Idade:${idade} Estado:${estado} CEP:${cep}
Descrição pessoal:${descricao}
Competências:${competenciaPessoa}
""" }}