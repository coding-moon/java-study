package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.UserVO;

public class UserDAO {
	 final int KEY = 9;
	public Connection connection; //���� ��ü
	public PreparedStatement preparedStatement; //���� ���� ��ü
	public ResultSet resultSet; //��� ���̺� ��ü
	
//	���̵� �ߺ��˻�
	public boolean checkId(String userIdentification) {
		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		boolean result = false;
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userIdentification);
			
			// �����Ͱ� resultset�� ���
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			result = resultSet.getInt(1) == 0;
			
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
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
		return result;
	}
	
//	ȸ������
	public boolean join(UserVO userVO) {
		String query = "INSERT INTO TBL_USER VALUES(USER_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		boolean result = false;
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setLong(1, userVO.getUserId());
			preparedStatement.setString(2, userVO.getUserIdentification());
			preparedStatement.setString(3, userVO.getUserName());
			preparedStatement.setString(4, userVO.getUserPassword());
			preparedStatement.setString(5, userVO.getUserPhone());
			preparedStatement.setString(6, userVO.getUserNickname());
			preparedStatement.setString(7, userVO.getUserEmail());
			preparedStatement.setString(8, userVO.getUserAddress());
			preparedStatement.setString(9, userVO.getUserBirth());
			preparedStatement.setString(10, userVO.getUserRecommenderId());
			
			result = preparedStatement.executeUpdate() == 1;
		} catch (SQLException e) {
			System.out.println("join(UserVO) SQL�� ����");
			e.printStackTrace();
		}catch (Exception e) {
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
		return result;
	}
//	�α���
	public UserVO login(String identification, String userPassword) {
		String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
				+ "USER_GENDER, USER_RECOMMENDER_ID "
				+ "FROM TBL_USER WHERE USER_IDENTIFICATION = ? AND USER_PASSWORD = ?"; 
		UserVO userVO = null;
			connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, identification);
			preparedStatement.setString(2, userPassword);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				userVO = new UserVO();
				userVO.setUserId(resultSet.getLong(1));
				userVO.setUserIdentification(resultSet.getString(2));
				userVO.setUserName(resultSet.getString(3));
				userVO.setUserPassword(resultSet.getString(4));
				userVO.setUserPhone(resultSet.getString(5));
				userVO.setUserNickname(resultSet.getString(6));
				userVO.setUserEmail(resultSet.getString(7));
				userVO.setUserAddress(resultSet.getString(8));
				userVO.setUserBirth(resultSet.getString(9));
				userVO.setUserGender(resultSet.getString(10));
				userVO.setUserRecommenderId(resultSet.getString(11));
			}
			
		} catch (SQLException e) {
			System.out.println("select(Long) SQL�� ����");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
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
		return userVO;
}
	 

//	��ȣȭ
	private String encry(String password) {
	      String encryPw = "";
	       for (int i = 0; i < password.length(); i++) {
	         encryPw += (char)(password.charAt(i) * KEY);
	      }
	       return encryPw;
	   }
	
//	ȸ��Ż��
	public boolean removeUser(String identification) {
		String query =  "DELETE FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		connection = DBConnecter.getConnection();
		boolean result = false;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, identification);
			
			result = preparedStatement.executeUpdate() == 1;
		} catch (SQLException e) {
			System.out.println("removeUser(String) SQL�� ����");
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
		return result;
	}
//	���̵� ã��
	public String findId(String phone) {
		String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_PHONE ?";
		
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, phone);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String result = resultSet.getString(1);
					
					if(result.equals(phone)) {
						System.out.println("success");
					}else{
						System.out.println("fail");
						}
					} 
			} catch (SQLException e) {
						System.out.println("findId(String) SQL�� ����");
						e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if(resultSet != null) {
								resultSet.close();
							}
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
		return result;
			}

	//	��й�ȣ ����
	 public boolean changePw(String userIdentification, String password) {
	      String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_IDENTIFICATION = ?";
	      connection = DBConnecter.getConnection();
	      boolean result = false;
	      
	      try {
	         preparedStatement = connection.prepareStatement(query);
	         preparedStatement.setString(1, encry(password));
	         preparedStatement.setString(2, userIdentification);
	         
	         result = preparedStatement.executeUpdate() == 1;
	      } catch (SQLException e) {
	         System.out.println("changePw(userVO) SQL�� ����");
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
	      
	      return result;
	 }
	 
//	ȸ������ ����
	public void updateUser(UserVO userVO) {
	      String query = "UPDATE TBL_USER"
	            + " SET USER_IDENTIFICATION = ?, USER_PHONE= ?, USER_NICKNAME= ?, USER_ADDRESS= ?, USER_EMAIL = ? "
	            + "WHERE USER_ID = ?";
	      connection = DBConnecter.getConnection();
	      
	      System.out.println(userVO);
	      try {
	         preparedStatement = connection.prepareStatement(query);
	         
	         preparedStatement.setString(1, userVO.getUserIdentification());
	         preparedStatement.setString(2, userVO.getUserPhone());
	         preparedStatement.setString(3, userVO.getUserNickname());
	         preparedStatement.setString(4, userVO.getUserAddress());
	         preparedStatement.setString(5, userVO.getUserEmail());
	         preparedStatement.setLong(6, userVO.getUserId());
	         
	         preparedStatement.executeUpdate();
	         
	      } catch (SQLException e) {
	         System.out.println("updateUser(UserVO) SQL�� ����");
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
	
//	ȸ������ ��ȸ
	public UserVO select(Long userId) {
		String query = 
				"SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
				+ "USER_GENDER, USER_RECOMMENDER_ID "
				+ "FROM TBL_USER WHERE USER_ID = ?";
		UserVO userVO = null;
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				userVO = new UserVO();
				userVO.setUserId(resultSet.getLong(1));
				userVO.setUserIdentification(resultSet.getString(2));
				userVO.setUserName(resultSet.getString(3));
				userVO.setUserPassword(resultSet.getString(4));
				userVO.setUserPhone(resultSet.getString(5));
				userVO.setUserNickname(resultSet.getString(6));
				userVO.setUserEmail(resultSet.getString(7));
				userVO.setUserAddress(resultSet.getString(8));
				userVO.setUserBirth(resultSet.getString(9));
				userVO.setUserGender(resultSet.getString(10));
				userVO.setUserRecommenderId(resultSet.getString(11));
			}
			
		} catch (SQLException e) {
			System.out.println("select(Long) SQL�� ����");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
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
		
		return userVO;
	}
	
//  ��õ��
	  public int recomendCount(String identification) {
	     String query = "SELECT COUNT(USER_RECOMMENDER_ID) FROM TBL_USER WHERE USER_RECOMMENDER_ID = ?";
	     int result = 0;
	     connection = DBConnecter.getConnection();
	     
	     try {
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, identification);
	        resultSet = preparedStatement.executeQuery();
	        
	        resultSet.next();
	        result = resultSet.getInt(1);
	
	     } catch (SQLException e) {
	        System.out.println("recomendCount() SQL�� ����");
	        e.printStackTrace();
	     } catch (Exception e) {
	        e.printStackTrace();
	     } finally {
	        try {
	           if(resultSet != null) {
	              resultSet.close();
	           }
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
	  
	     return result;
	  }
  
//  ���� ��õ�� ���
	  public ArrayList<UserVO> recomendForMe(UserVO userVO) {
	     String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD"
	     		+ "USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH"
	     		+ "USER_GENDER, USER_RECOMMENDER_ID "
	     		+ "FROM TBL_USER WHERE USER_RECOMMENDER_ID = ?";
	     ArrayList<UserVO> arData = null;
	     connection = DBConnecter.getConnection();
	     
	     try {
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, userVO.getUserIdentification());
	        preparedStatement.setString(2, userVO.getUserName());
	        preparedStatement.setString(3, userVO.getUserPassword());
	        preparedStatement.setString(4, userVO.getUserPhone());
	        preparedStatement.setString(5, userVO.getUserNickname());
	        preparedStatement.setString(6, userVO.getUserEmail());
	        preparedStatement.setString(7, userVO.getUserAddress());
	        preparedStatement.setString(8, userVO.getUserBirth());
	        preparedStatement.setString(9, userVO.getUserGender());
	        preparedStatement.setString(10, userVO.getUserRecommenderId());
	        
	        resultSet = preparedStatement.executeQuery();
	        
	        arData = new ArrayList<UserVO>();
	        while(resultSet.next()) {
	           arData.add(resultSet.getString(1));
	        }
	        
	     } catch (SQLException e) {
	        System.out.println("recomendForMe(userVO) SQL�� ����");
	        e.printStackTrace();
	     } catch (Exception e) {
	        e.printStackTrace();
	     } finally {
	        try {
	           if(resultSet != null) {
	              resultSet.close();
	           }
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
	     
	     return arData;
	  }
	  
//   ���� ��õ�� ���
	   public UserVO recomendForOther(UserVO userVO) {
		      String query ="SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
		            + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
		            + "USER_GENDER, USER_RECOMMENDER_ID "
		            + "FROM TBL_USER WHERE USER_RECOMMENDER_ID = ? AND USER_ID = ?";
		      connection = DBConnecter.getConnection();
		      UserVO user = null;
		      try {
		         preparedStatement = connection.prepareStatement(query);
		         preparedStatement.setString(1, userVO.getUserIdentification());
		         preparedStatement.setLong(2, userVO.getUserId());
		         resultSet = preparedStatement.executeQuery();
		         
		         resultSet.next();
		         while(resultSet.next()) {
		            user = new UserVO();
		            user.setUserId(resultSet.getLong(1));
		            user.setUserIdentification(resultSet.getString(2));
		            user.setUserName(resultSet.getString(3));
		            user.setUserPassword(resultSet.getString(4));
		            user.setUserPhone(resultSet.getString(5));
		            user.setUserNickname(resultSet.getString(6));
		            user.setUserEmail(resultSet.getString(7));
		            user.setUserAddress(resultSet.getString(8));
		            user.setUserBirth(resultSet.getString(9));
		            user.setUserGender(resultSet.getString(10));
		            user.setUserRecommenderId(resultSet.getString(11));
		         }
		         
		      } catch (SQLException e) {
		         System.out.println("recomendForMe(userVO) SQL�� ����");
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         try {
		            if(resultSet != null) {
		               resultSet.close();
		            }
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
		      
		      return user;
		      
		   }


}


















