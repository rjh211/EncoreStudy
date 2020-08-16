package p0429.addr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import p0429.DataBaseConnect;

public class DaoImpl implements Dao {
	private DataBaseConnect db;
	
	public DaoImpl(){
		db = DataBaseConnect.getInstance();
	}
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		//String sql = "insert into addr values(seq_addr.nextval '"+m.getName()+"'," +m.getTel()+"', '"+m.getAddress()+"')";
		String sql = "insert into addr values(seq_addr.nextval,?,?,?)";
		//1. db Ŀ�ؼ� ����
		Connection conn = db.getConnect();
		try {
			//2. Ŀ�ؼ� ��ü�� ������Ʈ��Ʈ ��ü ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//3. sql���� ? ����
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getTel());
			pstmt.setString(3, m.getAddress());
			//4. ���� ����
			int a = pstmt.executeUpdate();		//���� ���� , executeQuere => �б� ���� select�� ���
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<Member> selectByName(String name) {
		// TODO Auto-generated method stub
		String sql = "Select * from addr where name = '"+name+"'";
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>();
		Connection conn =db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int num = rs.getInt(1);
				String namea = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				list.add(new Member(num,namea,tel,address));
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public Member selectByNum(int num) {
		// TODO Auto-generated method stub
		String sql = "Select * from addr where num = "+num;
		ResultSet rs = null;
		Connection conn =db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()){
				int numa = rs.getInt(1);
				String namea = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				return new Member(numa,namea,tel,address);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from addr";
		ArrayList<Member> list = new ArrayList<Member>();
		ResultSet rs = null;
		Connection conn =db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){	//rs.next() �˻� ������� �� �̵�
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				Member m = new Member(num,name,tel,address);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
//		String sql = "update addr set tel=? , address=? where num = ?";
		String sql = "update addr set name = ?, address = ?, tel = ? where num = ?";
//		String sql = "insert into addr values(seq_addr.nextval,?,?,?)";
		Connection conn = db.getConnect();
		try {
			//2. Ŀ�ؼ� ��ü�� ������Ʈ��Ʈ ��ü ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//3. sql���� ? ����
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getAddress());
			pstmt.setString(3, m.getTel());
			pstmt.setInt(4, m.getNum());
			//4. ���� ����
			int a = pstmt.executeUpdate();		//���� ���� , executeQuere => �б� ���� select�� ���
			System.out.println("������ �Է� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql = "delete addr where carnumber = "+num;
		Connection conn = db.getConnect();
		try {
			//2. Ŀ�ؼ� ��ü�� ������Ʈ��Ʈ ��ü ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int a = pstmt.executeUpdate();		//���� ���� , executeQuere => �б� ���� select�� ���
			System.out.println(a);
			System.out.println("���� �Ϸ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
