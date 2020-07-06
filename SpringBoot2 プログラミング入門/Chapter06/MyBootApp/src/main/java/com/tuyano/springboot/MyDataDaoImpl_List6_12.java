package com.tuyano.springboot;

//import javax.persistence.EntityManager;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.Query;

/**
 * リスト6-12
 */
public class MyDataDaoImpl_List6_12 /* implements MyDataDao<MyData> */ {

//	private static final long serialVersionUID = 1L;
//
//	private EntityManager entityManager;
//
//	public MyDataDaoImpl_List6_12() {
//		super();
//	}
//
//	public MyDataDaoImpl_List6_12(EntityManager manager) {
//		this();
//		entityManager = manager;
//	}
//
//	@Override
//	public List<MyData> getAll() {
//		Query query = entityManager.createQuery("from MyData");
//		@SuppressWarnings("unchecked")
//		List<MyData> list = query.getResultList();
//		entityManager.close();
//		return list;
//	}
//
//	@Override
//	public MyData findById(long id) {
//		return (MyData) entityManager.createQuery("from MyData where id = " + id).getSingleResult();
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<MyData> findByName(String name) {
//		return (List<MyData>) entityManager.createQuery("from MyData where name = " + name).getResultList();
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<MyData> find(String fstr) {
//		List<MyData> list = null;
//		String qstr = "from MyData where id = ?1 or name like ?2 or mail like ?3";
//		Long fid = 0L;
//		try {
//			fid = Long.parseLong(fstr);
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
//		Query query = entityManager.createQuery(qstr).setParameter(1, fid).setParameter(2, "%" + fstr + "%")
//				.setParameter(3, fstr + "@%");
//		list = query.getResultList();
//		return list;
//	}
}
