
class PessoaJuridica extends Pessoa {
    String cnpj, pais
    def competenciaEmpresa = []

    def setCompetenciaEmpresa (Competencia){
        competenciaEmpresa = Competencia
    }

    PessoaJuridica(String nome, String email, String cnpj, String pais, String estado, String cep, String descricao, competenciaEmpresa ){
        super(nome,email,estado,cep,descricao)
        this.nome = nome
        this.email = email
        this.cnpj = cnpj
        this.pais = pais
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
        this.competenciaEmpresa = competenciaEmpresa
    }
    @Override
    String toString (){
        return """Nome:${nome}
Email:${email}
CNPJ:${cnpj}
País:${pais} Estado:${estado} CEP:${cep}
Descrição pessoal:${descricao}
Competências:${competenciaEmpresa}
"""

    }
}