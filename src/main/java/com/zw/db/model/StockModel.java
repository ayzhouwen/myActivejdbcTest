package com.zw.db.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

/**
 * 设备数据表
 */
@Table("stock")
@IdName("id")
public class StockModel extends Model {
}