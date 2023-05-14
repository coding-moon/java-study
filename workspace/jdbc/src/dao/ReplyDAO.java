package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import domain.ReplyDTO;
import domain.ReplyVO;

public class ReplyDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;

// ¥Ò±€ √ﬂ∞°
	public void add(ReplyVO replyVO) {
		String query = "INSERT INTO TBL_REPLY"
	            + "(REPLY_ID, REPLY_CONTENT, USER_ID, BOARD_ID, REPLY_GROUP, REPLY_DEPTH) "
	            + "VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?, ?, (SELECT REPLY_DEPTH + 1 FROM TBL_REPLY WHERE REPLY_ID = ?))";
		
		connection = DBConnecter.getConnection();
		try {
			 preparedStatement = connection.prepareStatement(query);
			 preparedStatement.setString(1, replyVO.getReplyContent());
			 preparedStatement.setLong(2, UserDAO.userId);
			 preparedStatement.setLong(3, replyVO.getBoardId());
			 preparedStatement.setLong(4, replyVO.getReplyGroup());
			 preparedStatement.setLong(5, replyVO.getReplyDepth());
			 preparedStatement.executeUpdate();
		 
		  } catch (SQLException e) {
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            throw new RuntimeException(e);
	         }
	      }
	   }
// ¥Ò±€ ¿¸√º ¡∂»∏
	public ReplyDTO select(Long replyId) {
		String query = "SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, "
	            + " BOARD_UPDATE_DATE, REPLY_ID, REPLY_CONTENT, USER_ID, BOARD_ID, REPLY_GROUP, REPLY_DEPTH "
	            + "FROM TBL_USER U, TBL_BOARD B, TBL_REPLY R "
	            + "ON U.USER_ID = B.USER_ID = R.USER_ID REPLY_ID = ?";
		
		connection = DBConnecter.getConnection();
		ReplyDTO replyDTO = null;
		int index = 0;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, replyId);
			
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				replyDTO = new ReplyDTO();
				replyDTO.setBoardId(resultSet.getLong(++index));
	            replyDTO.setBoardTitle(resultSet.getString(++index));
	            replyDTO.setBoardContent(resultSet.getString(++index));
	            replyDTO.setBoardRegisterDate(resultSet.getString(++index));
	            replyDTO.setBoardUpdateDate(resultSet.getString(++index));
	            replyDTO.setUserId(resultSet.getLong(++index));
	            replyDTO.setUserIdentification(resultSet.getString(++index));
	            replyDTO.setUserName(resultSet.getString(++index));
	            replyDTO.setUserPassword(resultSet.getString(++index));
	            replyDTO.setUserPhone(resultSet.getString(++index));
	            replyDTO.setUserNickname(resultSet.getString(++index));
	            replyDTO.setUserEmail(resultSet.getString(++index));
	            replyDTO.setUserAddress(resultSet.getString(++index));
	            replyDTO.setUserBirth(resultSet.getString(++index));
	            replyDTO.setUserGender(resultSet.getString(++index));
	            replyDTO.setUserRecommenderId(resultSet.getString(++index));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
			

	
// ¥Î¥Ò±€ ªË¡¶
	public void remove(Long replyId) {
		String query = "DELETE FROM TBL_REPLY WHERE REPLY_ID = ? ";
		
		connection = DBConnecter.getConnection();
		try {
			preparedStatement  = connection.prepareStatement(query);
			
			preparedStatement.setLong(1, replyId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
				}
			}
		}

// ¥Ò±€ ªË¡¶
	public void removeReply(Long groupId) {
		String query = "DELETE FROM TBL_REPLY WHERE REPLY_GROUP = ? ";
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, groupId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
		
			}
		}
	}
// ¥Ò±€ ºˆ¡§
	public void update(ReplyVO replyVO) {
		String query = "UPDATE TBL_REPLY SET REPLY_CONTENT = ?, WHERE BOARD_ID = ?";
		connection = DBConnecter.getConnection();
		 try {
			preparedStatement = connection.prepareStatement(query);
			 
			 preparedStatement.setString(1, replyVO.getReplyContent());
			 preparedStatement.setLong(2, replyVO.getBoardId());
			 preparedStatement.executeUpdate();
		 } catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
		}
		 
	  }
		
	}


}
