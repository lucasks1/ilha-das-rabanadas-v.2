package com.ilhaDasRabanadas.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilhaDasRabanadas.bean.Pedido;
import com.ilhaDasRabanadas.dao.PedidoDao;

/**
 * Servlet implementation class PedidoInsertServlet
 */
@WebServlet("/PedidoInsertServlet")
public class PedidoInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PedidoInsertServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		String nomeProduto = request.getParameter("nomeProduto");
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		String quantidade = request.getParameter("quantidadePedido");
		String valorPedido = request.getParameter("valorPedido");
		String endereco = request.getParameter("endereco");
		String dataEntrega = request.getParameter("dataEntrega");
		String hora = request.getParameter("hora");
		String troco = request.getParameter("troco");
		String formaPagamento = request.getParameter("flexRadioDefault");
		try {
			Pedido pedido = new Pedido();
			pedido.setIdCliente(idCliente);
			pedido.setNomeProduto(nomeProduto);
			pedido.setQuantidadePedido(quantidade);
			pedido.setValorPedido(valorPedido);
			pedido.setEndereco(endereco);
			pedido.setDataEntrega(dataEntrega);
			pedido.setHora(hora);
			pedido.setFormaPagamento(formaPagamento);
			pedido.setTroco(troco);
			PedidoDao pedidoDao = new PedidoDao();
			pedidoDao.insert(pedido);
			response.sendRedirect("./Cliente/meusPedidos.jsp");
		} catch (Exception e) {
			System.out.println("error na servlet");
			System.out.println(e.getMessage());
		}
	}

}
