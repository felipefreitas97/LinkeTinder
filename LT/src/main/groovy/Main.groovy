
import java.util.regex.Pattern

static void main(String[] args) {
  //Listas Candidatos,Empresas e Competências
  List<PessoaFisica> ListaPessoas = []
  List<PessoaJuridica> ListaEmpresa = []
  List ListaCompetencia = ["Python", "Java", "Spring Framework", "Angular", "React", "JavaScript", "SQL"]

  //Regex CPF e CPNJ
  //Pattern pattern = Pattern.compile(/^([0-9]{3}[.]?[0-9]{3}[.]?[0-9]{3}[-]?[0-9]{2}|[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2})$/)


          //Método de Inserção Candidatos e Empresas nas listas
  PessoaFisica pessoaA = new PessoaFisica("Felipe", "felipefreitas@gmail.com", "123.456.789.01", "24", "GO", "74313300", "Estundante na área de Data Science e Desenvolvimento Web", ListaCompetencia[0, 1, 5, 6])
  ListaPessoas << pessoaA
  PessoaJuridica empresaA = new PessoaJuridica ("EmpresaA", "empresA@gmail.com", "01.123.456./0001-99", "BR", "GO", "71414422", "Empresa de aplicativo mobile", ListaCompetencia[3,4,5])
  ListaEmpresa << empresaA

  PessoaFisica pessoa001 = new PessoaFisica(null,null,null,null,null,null,null,null)
  ListaPessoas << pessoa001
  pessoa001.setNome("Geraldo Noah da Mota")
  pessoa001.setEmail("geraldonoahdamota@somma.net.br")
  pessoa001.setCpf("669.826.247-14")
  pessoa001.setIdade("23")
  pessoa001.setEstado("BA")
  pessoa001.setCep("40300-195")
  pessoa001.setDescricao("Descricao001")
  pessoa001.setCompetenciaPessoa (ListaCompetencia[3,2])

  PessoaFisica pessoa002 = new PessoaFisica(null,null,null,null,null,null,null,null)
  ListaPessoas << pessoa002
  pessoa002.setNome("Bárbara Débora Alícia Teixeira")
  pessoa002.setEmail("barbara-teixeira75@cavalinho.srv.br")
  pessoa002.setCpf("125.401.809-30")
  pessoa002.setIdade("21")
  pessoa002.setEstado("PE")
  pessoa002.setCep("50070-01")
  pessoa002.setDescricao("Descricao002")
  pessoa002.setCompetenciaPessoa (ListaCompetencia[1,2,6])

  PessoaFisica pessoa003 = new PessoaFisica(null,null,null,null,null,null,null,null)
  ListaPessoas << pessoa003
  pessoa003.setNome("Cristiane Jaqueline da Cruz")
  pessoa003.setEmail("cristiane_dacruz@signa.net.br")
  pessoa003.setCpf("354.037.829-40")
  pessoa003.setIdade("24")
  pessoa003.setEstado("RS")
  pessoa003.setCep("93285-478")
  pessoa003.setDescricao("Descricao003")
  pessoa003.setCompetenciaPessoa (ListaCompetencia[4,5,6])

  PessoaFisica pessoa004 = new PessoaFisica(null,null,null,null,null,null,null,null)
  ListaPessoas << pessoa004
  pessoa004.setNome("Cristiane Jaqueline da Cruz")
  pessoa004.setEmail("cristiane_dacruz@signa.net.br")
  pessoa004.setCpf("026.490.267-07")
  pessoa004.setIdade("24")
  pessoa004.setEstado("RS")
  pessoa004.setCep("93285-478")
  pessoa004.setDescricao("Descricao004")
  pessoa004.setCompetenciaPessoa (ListaCompetencia[4,5,6])

  PessoaFisica pessoa005 = new PessoaFisica(null,null,null,null,null,null,null,null)
  ListaPessoas << pessoa005
  pessoa005.setNome("Catarina Francisca Amanda Souza")
  pessoa005.setEmail("catarina_souza@lvnonline.com.be")
  pessoa005.setCpf("799.966.491-05")
  pessoa005.setIdade("26")
  pessoa005.setEstado("RS")
  pessoa005.setCep("98802-745")
  pessoa005.setDescricao("Descricao005")
  pessoa005.setCompetenciaPessoa (ListaCompetencia[0,6])

  PessoaJuridica empresa001 = new PessoaJuridica(null,null,null,null,null,null,null,null)
  ListaEmpresa << empresa001
  empresa001.setNome("Pietro e Gabriel Informática Ltda")
  empresa001.setEmail("treinamento@pietroegabrielinformaticaltda.com.br")
  empresa001.setCnpj("02.102.642/0001-27")
  empresa001.setPais("Brasil")
  empresa001.setEstado("GO")
  empresa001.setCep("75136-085")
  empresa001.setDescricao("DescriçãoE01")
  empresa001.setCompetenciaEmpresa(ListaCompetencia[3,5])

  PessoaJuridica empresa002 = new PessoaJuridica(null,null,null,null,null,null,null,null)
  ListaEmpresa << empresa002
  empresa002.setNome("Kamilly e Ian Marketing Ltda")
  empresa002.setEmail("sistema@kamillyeianmarketingltda.com.br")
  empresa002.setCnpj("50.006.036/0001-50")
  empresa002.setPais("Brasil")
  empresa002.setEstado("SP")
  empresa002.setCep("12949-180")
  empresa002.setDescricao("DescriçãoE02")
  empresa002.setCompetenciaEmpresa(ListaCompetencia[1,5,4])

  PessoaJuridica empresa003 = new PessoaJuridica(null,null,null,null,null,null,null,null)
  ListaEmpresa << empresa003
  empresa003.setNome("Erick e Thales Telecomunicações ME")
  empresa003.setEmail("posvenda@erickethalestelecomunicacoesme.com.br")
  empresa003.setCnpj("35.757.955/0001-72")
  empresa003.setPais("Brasil")
  empresa003.setEstado("SP")
  empresa003.setCep("09952-308")
  empresa003.setDescricao("DescriçãoE03")
  empresa003.setCompetenciaEmpresa(ListaCompetencia[2])

  PessoaJuridica empresa004 = new PessoaJuridica(null,null,null,null,null,null,null,null)
  ListaEmpresa << empresa004
  empresa004.setNome("Bruno e Andrea Informática Ltda")
  empresa004.setEmail("contato@brunoeandreainformaticaltda.com.br")
  empresa004.setCnpj("53.092.086/0001-96")
  empresa004.setPais("Brasil")
  empresa004.setEstado("RS")
  empresa004.setCep("93218-310")
  empresa004.setDescricao("DescriçãoE04")
  empresa004.setCompetenciaEmpresa(ListaCompetencia[4,6])

  PessoaJuridica empresa005 = new PessoaJuridica(null,null,null,null,null,null,null,null)
  ListaEmpresa << empresa005
  empresa005.setNome(" Entregas Expressas Ltda")
  empresa005.setEmail("contato@martineianentregasexpressasltda.com.br")
  empresa005.setCnpj("85.878.032/0001-47")
  empresa005.setPais("Brasil")
  empresa005.setEstado("GO")
  empresa005.setCep("75064-360")
  empresa005.setDescricao("DescriçãoE05")
  empresa005.setCompetenciaEmpresa(ListaCompetencia[1,5])

  println(ListaPessoas)
  println(ListaEmpresa)












  /*
  println("---LinkeTinder---")
  println("Cadastro 1-Candidato, 2-Empresa")
  Scanner sc = new Scanner(System.in)
  int opcao = sc.nextInt()

  switch (opcao) {
    case 1:
      System.out.println("Cadastro -> Escreva o Nome:")
      String nome = sc.next()
      System.out.println("Cadastro -> Escreva o Email:")
      String email = sc.next()
      System.out.println("Cadastro -> Escreva o CPF:")
      String cpf = sc.next()
      //Matcher matcher = pattern.matcher(cpf)
      System.out.println("Cadastro -> Escreva o idade:")
      String idade = sc.next()
      System.out.println("Cadastro -> Escreva o Estado:")
      String estado = sc.next()
      System.out.println("Cadastro -> Escreva o CEP:")
      String cep = sc.next()
      System.out.println("Cadastro -> Escreva a descrição:")
      String descricao = sc.next()
      println("As competências são:")
      int i = 0
      for (String competencia : ListaCompetencia) {
        System.out.println("indice:" + i + "-" + competencia)
        i++
      }
      System.out.println("Cadastro -> Escolha os indices da competência:")

      String indicesInput = sc.next()
      String[] indicesNum = indicesInput.split(",")
      println(indicesNum)
      int[] indices = new int[indicesNum.length]
      println(indices)
      int index = 0
      for (int j = 0; j < indicesNum.length; ++j) {
        try {
          indices[index] = Integer.parseInt(indicesNum[j])
          index++
        }
        catch (Exception e) {
          "formato inválido, ex: deve ser '1,2,3'"
        }
      }*/


  }
