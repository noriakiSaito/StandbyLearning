package com.tuyano.springboot;

//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
//import javax.persistence.criteria.CriteriaBuilder; // リスト6-22
//import javax.persistence.criteria.CriteriaQuery;	// リスト6-22
//import javax.persistence.criteria.Root;				// リスト6-22

/**
 * リスト6-22
 */
public class MyDataDaoImpl_List6_22 /* implements MyDataDao<MyData> */ {

//	private static final long serialVersionUID = 1L;
//
//	private EntityManager entityManager;
//
//	public MyDataDaoImpl_List6_22() {
//		super();
//	}
//
//	public MyDataDaoImpl_List6_22(EntityManager manager) {
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
//
//		Long fid = 0L;
//		try {
//			fid = Long.parseLong(fstr);
//		} catch (NumberFormatException e) {
//			//e.printStackTrace();
//		}
//		Query query = entityManager.createNamedQuery("findWithName").setParameter("fname", "%" + fstr + "%");
//		list = query.getResultList();
//		return list;
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<MyData> findByAge(int min, int max) {
//		return (List<MyData>) entityManager.createNamedQuery("findByAge")
//				.setParameter("min", min)
//				.setParameter("max", max)
//				.getResultList();
//	}

}
