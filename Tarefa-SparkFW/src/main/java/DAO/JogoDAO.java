package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Jogo;


public class JogoDAO extends DAO{
	public JogoDAO() {
		super();
		conectar();
	}
	
	
	public void finalize() {
		close();
	}
	
	public boolean insert(Jogo jogo) {
		boolean status = false;
		
		try
		{
			String sql = "INSERT INTO jogo (nome, preco, categoria, publisher) "
		               + "VALUES ('" + jogo.getNome() + "', "
		               + jogo.getPreco() + ", '" + jogo.getCategoria() + "' , '"+ jogo.getPublisher()+"');";
			PreparedStatement st = conexao.prepareStatement(sql);
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	
	public Jogo get(int id) {
		Jogo jogo = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM jogo WHERE id="+id;
			ResultSet rs = st.executeQuery(sql);	
	        if(rs.next()){            
	        	 jogo = new Jogo(rs.getInt("ID"), (float)rs.getDouble("preco"),rs.getString("nome"), rs.getString("categoria"), rs.getString("publisher")); 
	                				  
	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return jogo;
	}
	
	
	public List<Jogo> get() {
		return get("");
	}

	
	public List<Jogo> getOrderByID() {
		return get("id");		
	}
	
	
	public List<Jogo> getOrderByNome() {
		return get("nome");		
	}
	
	
	public List<Jogo> getOrderByPreco() {
		return get("preco");		
	}
	
	
	private List<Jogo> get(String orderBy) {
		List<Jogo> jogos = new ArrayList<Jogo>();
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM jogo" + ((orderBy.trim().length() == 0) ? "" : (" ORDER BY " + orderBy));
			ResultSet rs = st.executeQuery(sql);	           
	        while(rs.next()) {	            	
	        	Jogo p = new Jogo(rs.getInt("ID"), (float)rs.getDouble("preco"),rs.getString("nome"), rs.getString("categoria"), rs.getString("publisher"));
	            jogos.add(p);
	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return jogos;
	}
	
	
	public boolean delete(int id) {
		boolean status = false;
		try 
		{
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM jogo WHERE id = " + id);
			st.close();
			status = true;
		}catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean update(Jogo jogo) {
		boolean status = false;
		try 
		{
			String sql = "UPDATE jogo SET nome = '" + jogo.getNome() + "', "
					   + "preco = " + jogo.getPreco() + ", " 
					   + "categoria = '" + jogo.getCategoria() + "', "
					   + "publisher = '" + jogo.getPublisher()  + "'" 
					   + "WHERE id = " + jogo.getID();
			PreparedStatement st = conexao.prepareStatement(sql);
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}

}
