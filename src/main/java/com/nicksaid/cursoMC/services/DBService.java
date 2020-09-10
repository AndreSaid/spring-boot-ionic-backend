package com.nicksaid.cursoMC.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nicksaid.cursoMC.domain.Categoria;
import com.nicksaid.cursoMC.domain.Cidade;
import com.nicksaid.cursoMC.domain.Cliente;
import com.nicksaid.cursoMC.domain.Endereco;
import com.nicksaid.cursoMC.domain.Estado;
import com.nicksaid.cursoMC.domain.ItemPedido;
import com.nicksaid.cursoMC.domain.Pagamento;
import com.nicksaid.cursoMC.domain.PagamentoComBoleto;
import com.nicksaid.cursoMC.domain.PagamentoComCartao;
import com.nicksaid.cursoMC.domain.Pedido;
import com.nicksaid.cursoMC.domain.Produto;
import com.nicksaid.cursoMC.domain.enums.EstadoPagamento;
import com.nicksaid.cursoMC.domain.enums.Perfil;
import com.nicksaid.cursoMC.domain.enums.TipoCliente;
import com.nicksaid.cursoMC.repositories.CategoriaRepository;
import com.nicksaid.cursoMC.repositories.CidadeRepository;
import com.nicksaid.cursoMC.repositories.ClienteRepository;
import com.nicksaid.cursoMC.repositories.EnderecoRepository;
import com.nicksaid.cursoMC.repositories.EstadoRepository;
import com.nicksaid.cursoMC.repositories.ItemPedidoRepository;
import com.nicksaid.cursoMC.repositories.PagamentoRepository;
import com.nicksaid.cursoMC.repositories.PedidoRepository;
import com.nicksaid.cursoMC.repositories.ProdutoRepository;


@Service
public class DBService {

	@Autowired
	private BCryptPasswordEncoder pe;
	
	@Autowired
	private CategoriaRepository categoriaRepository; 
	@Autowired
	private ProdutoRepository produtoRepository; 
	@Autowired
	private EstadoRepository estadoRepository; 
	@Autowired
	private CidadeRepository cidadeRepository; 
	@Autowired
	private ClienteRepository clienteRepository; 
	@Autowired
	private EnderecoRepository enderecoRepository; 
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PagamentoRepository pagamentoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	
	public void instantiateTestDatabase() throws ParseException {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Cama mesa e banho");
		Categoria cat4 = new Categoria(null, "Eletrônicos");
		Categoria cat5 = new Categoria(null, "Jardinagem");
		Categoria cat6 = new Categoria(null, "Decoração");
		Categoria cat7 = new Categoria(null, "Perfumaria");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		Produto p4 = new Produto(null, "Mesa de escritório", 300.00);
		Produto p5 = new Produto(null, "Toalha", 50.00);
		Produto p6 = new Produto(null, "Colcha", 200.00);
		Produto p7 = new Produto(null, "TV true color", 1200.00);
		Produto p8 = new Produto(null, "Roçadeira", 800.00);
		Produto p9 = new Produto(null, "Abaujour", 100.00);
		Produto p10 = new Produto(null, "Pendente", 180.00);
		Produto p11 = new Produto(null, "Shampoo", 90.00);
		
		Produto p12 = new Produto(null, "Produto 12", 10.00);
		Produto p13 = new Produto(null, "Produto 13", 10.00);
		Produto p14 = new Produto(null, "Produto 14", 10.00);
		Produto p15 = new Produto(null, "Produto 15", 10.00);
		Produto p16 = new Produto(null, "Produto 16", 10.00);
		Produto p17 = new Produto(null, "Produto 17", 10.00);
		Produto p18 = new Produto(null, "Produto 18", 10.00);
		Produto p19 = new Produto(null, "Produto 19", 10.00);
		Produto p20 = new Produto(null, "Produto 20", 10.00);
		Produto p21 = new Produto(null, "Produto 21", 10.00);
		Produto p22 = new Produto(null, "Produto 22", 10.00);
		Produto p23 = new Produto(null, "Produto 23", 10.00);
		Produto p24 = new Produto(null, "Produto 24", 10.00);
		Produto p25 = new Produto(null, "Produto 25", 10.00);
		Produto p26 = new Produto(null, "Produto 26", 10.00);
		Produto p27 = new Produto(null, "Produto 27", 10.00);
		Produto p28 = new Produto(null, "Produto 28", 10.00);
		Produto p29 = new Produto(null, "Produto 29", 10.00);
		Produto p30 = new Produto(null, "Produto 30", 10.00);
		Produto p31 = new Produto(null, "Produto 31", 10.00);
		Produto p32 = new Produto(null, "Produto 32", 10.00);
		Produto p33 = new Produto(null, "Produto 33", 10.00);
		Produto p34 = new Produto(null, "Produto 34", 10.00);
		Produto p35 = new Produto(null, "Produto 35", 10.00);
		Produto p36 = new Produto(null, "Produto 36", 10.00);
		Produto p37 = new Produto(null, "Produto 37", 10.00);
		Produto p38 = new Produto(null, "Produto 38", 10.00);
		Produto p39 = new Produto(null, "Produto 39", 10.00);
		Produto p40 = new Produto(null, "Produto 40", 10.00);
		Produto p41 = new Produto(null, "Produto 41", 10.00);
		Produto p42 = new Produto(null, "Produto 42", 10.00);
		Produto p43 = new Produto(null, "Produto 43", 10.00);
		Produto p44 = new Produto(null, "Produto 44", 10.00);
		Produto p45 = new Produto(null, "Produto 45", 10.00);
		Produto p46 = new Produto(null, "Produto 46", 10.00);
		Produto p47 = new Produto(null, "Produto 47", 10.00);
		Produto p48 = new Produto(null, "Produto 48", 10.00);
		Produto p49 = new Produto(null, "Produto 49", 10.00);
		Produto p50 = new Produto(null, "Produto 50", 10.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
		p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
		p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		p12.getCategorias().add(cat1);
		p13.getCategorias().add(cat1);
		p14.getCategorias().add(cat1);
		p15.getCategorias().add(cat1);
		p16.getCategorias().add(cat1);
		p17.getCategorias().add(cat1);
		p18.getCategorias().add(cat1);
		p19.getCategorias().add(cat1);
		p20.getCategorias().add(cat1);
		p21.getCategorias().add(cat1);
		p22.getCategorias().add(cat1);
		p23.getCategorias().add(cat1);
		p24.getCategorias().add(cat1);
		p25.getCategorias().add(cat1);
		p26.getCategorias().add(cat1);
		p27.getCategorias().add(cat1);
		p28.getCategorias().add(cat1);
		p29.getCategorias().add(cat1);
		p30.getCategorias().add(cat1);
		p31.getCategorias().add(cat1);
		p32.getCategorias().add(cat1);
		p33.getCategorias().add(cat1);
		p34.getCategorias().add(cat1);
		p35.getCategorias().add(cat1);
		p36.getCategorias().add(cat1);
		p37.getCategorias().add(cat1);
		p38.getCategorias().add(cat1);
		p39.getCategorias().add(cat1);
		p40.getCategorias().add(cat1);
		p41.getCategorias().add(cat1);
		p42.getCategorias().add(cat1);
		p43.getCategorias().add(cat1);
		p44.getCategorias().add(cat1);
		p45.getCategorias().add(cat1);
		p46.getCategorias().add(cat1);
		p47.getCategorias().add(cat1);
		p48.getCategorias().add(cat1);
		p49.getCategorias().add(cat1);
		p50.getCategorias().add(cat1);
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2,p4));
		cat3.getProdutos().addAll(Arrays.asList(p5,p6));
		cat4.getProdutos().addAll(Arrays.asList(p1,p2,p3,p7));
		cat5.getProdutos().addAll(Arrays.asList(p8));
		cat6.getProdutos().addAll(Arrays.asList(p9,p10));
		cat7.getProdutos().addAll(Arrays.asList(p11));

		
		
		
		p1.getCategorias().addAll(Arrays.asList(cat1,cat4));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2,cat4));
		p3.getCategorias().addAll(Arrays.asList(cat1,cat4));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		p5.getCategorias().addAll(Arrays.asList(cat3));
		p6.getCategorias().addAll(Arrays.asList(cat3));
		p7.getCategorias().addAll(Arrays.asList(cat4));
		p8.getCategorias().addAll(Arrays.asList(cat5));
		p9.getCategorias().addAll(Arrays.asList(cat6));
		p10.getCategorias().addAll(Arrays.asList(cat6));
		p11.getCategorias().addAll(Arrays.asList(cat7));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,p11));
		
		produtoRepository.saveAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		Estado est1 = new Estado(null,"Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		Estado est3 = new Estado(null, "Acre");
		Estado est4 = new Estado(null, "Alagoas");
		Estado est5 = new Estado(null, "Amapá");
		Estado est6 = new Estado(null, "Amazonas");
		Estado est7 = new Estado(null, "Bahia");
		Estado est8 = new Estado(null, "Ceará");
		Estado est9 = new Estado(null, "Espírito Santo");
		Estado est10 = new Estado(null, "Goiás");
		Estado est11 = new Estado(null, "Maranhão");
		Estado est12 = new Estado(null, "Mato Grosso");
		Estado est13 = new Estado(null, "Mato Grosso do Sul");
		Estado est14 = new Estado(null, "Pará");
		Estado est15 = new Estado(null, "Paraíba");
		Estado est16 = new Estado(null, "Paraná");
		Estado est17 = new Estado(null, "Pernambuco");
		Estado est18 = new Estado(null, "Piauí");
		Estado est19 = new Estado(null, "Rio de Janeiro");
		Estado est20 = new Estado(null, "Rio grande do Norte");
		Estado est21 = new Estado(null, "Rio grande do Sul");
		Estado est22 = new Estado(null, "Rondônia");
		Estado est23 = new Estado(null, "Roraima");
		Estado est24 = new Estado(null, "Santa Catarina");
		Estado est25 = new Estado(null, "Sergipe");
		Estado est26 = new Estado(null, "Tocantins");
		Estado est27 = new Estado(null, "Distrito Federal");
		
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		Cidade c4 = new Cidade(null, "Rio Branco", est3);
		Cidade c5 = new Cidade(null, "Maceió", est4);
		Cidade c6 = new Cidade(null, "Macapá", est5);
		Cidade c7 = new Cidade(null, "Manaus", est6);
		Cidade c8 = new Cidade(null, "Salvador", est7);
		Cidade c9 = new Cidade(null, "Fortaleza", est8);
		Cidade c10 = new Cidade(null, "Vitória", est9);
		Cidade c11 = new Cidade(null, "Goiânia", est10);
		Cidade c12 = new Cidade(null, "São Luís", est11);
		Cidade c13 = new Cidade(null, "Cuiabá", est12);
		Cidade c14 = new Cidade(null, "Campo Grande", est13);
		Cidade c15 = new Cidade(null, "Belém", est14);
		Cidade c16 = new Cidade(null, "João Pessoa", est15);
		Cidade c17 = new Cidade(null, "Curitiba", est16);
		Cidade c18 = new Cidade(null, "Recife", est17);
		Cidade c19 = new Cidade(null, "Teresina", est18);
		Cidade c20 = new Cidade(null, "Rio de Janeiro", est19);
		Cidade c21 = new Cidade(null, "Natal", est20);
		Cidade c22 = new Cidade(null, "Porto Alegre", est21);
		Cidade c23 = new Cidade(null, "Porto Velho", est22);
		Cidade c24 = new Cidade(null, "Boa Vista", est23);
		Cidade c25 = new Cidade(null, "Florianópolis", est24);
		Cidade c26 = new Cidade(null, "Aracaju", est25);
		Cidade c27 = new Cidade(null, "Palmas", est26);
		Cidade c28 = new Cidade(null, "Brasilia", est27);
		
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		est3.getCidades().addAll(Arrays.asList(c4));
		est4.getCidades().addAll(Arrays.asList(c5));
		est5.getCidades().addAll(Arrays.asList(c6));
		est6.getCidades().addAll(Arrays.asList(c7));
		est7.getCidades().addAll(Arrays.asList(c8));
		est8.getCidades().addAll(Arrays.asList(c9));
		est9.getCidades().addAll(Arrays.asList(c10));
		est10.getCidades().addAll(Arrays.asList(c11));
		est11.getCidades().addAll(Arrays.asList(c12));
		est12.getCidades().addAll(Arrays.asList(c13));
		est13.getCidades().addAll(Arrays.asList(c14));
		est14.getCidades().addAll(Arrays.asList(c15));
		est15.getCidades().addAll(Arrays.asList(c16));
		est16.getCidades().addAll(Arrays.asList(c17));
		est17.getCidades().addAll(Arrays.asList(c18));
		est18.getCidades().addAll(Arrays.asList(c19));
		est19.getCidades().addAll(Arrays.asList(c20));
		est20.getCidades().addAll(Arrays.asList(c21));
		est21.getCidades().addAll(Arrays.asList(c22));
		est22.getCidades().addAll(Arrays.asList(c23));
		est23.getCidades().addAll(Arrays.asList(c24));
		est24.getCidades().addAll(Arrays.asList(c25));
		est25.getCidades().addAll(Arrays.asList(c26));
		est26.getCidades().addAll(Arrays.asList(c27));
		est27.getCidades().addAll(Arrays.asList(c28));
		
		
		
		estadoRepository.saveAll(Arrays.asList(est1, est2,est3,est4, est5, est6, est7, est8, est9, est10, est11, est12, est13, est14, est15, est16, est17, est18, est19, est20, est21, est22, est23, est24, est25, est26, est27));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28));
		
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "nicksaiddev@gmail.com", "36378912377", TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli1.getTelefones().addAll(Arrays.asList("27363323","93838393"));
		cli1.addPerfil(Perfil.ADMIN);
		
		Cliente cli2 = new Cliente(null, "Karol teixeira", "andrresaid@gmail.com", "71060380080", TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli2.addPerfil(Perfil.ADMIN);
		cli2.getTelefones().addAll(Arrays.asList("909342323","923838393"));
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos","105","Sala 800", "Centro", "38777012",cli1, c2);
		Endereco e3 = new Endereco(null, "Avenida Cristais","1015",null, "Centro 2", "20777012",cli2, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		cli2.getEnderecos().addAll(Arrays.asList(e3));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		enderecoRepository.saveAll(Arrays.asList(e1,e2,e3));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1 , e1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli1 , e2);
		
		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
		ped2.setPagamento(pagto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1,ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1,ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1,pagto2));
		
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.0);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		
		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		
		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip3));
		p3.getItens().addAll(Arrays.asList(ip2));
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1,ip2,ip3));
	}

}
