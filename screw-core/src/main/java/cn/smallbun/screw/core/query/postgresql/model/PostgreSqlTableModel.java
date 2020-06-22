/*
 * screw-core - 简洁好用的数据库文档生成器
 * Copyright © 2020 SanLi (qinggang.zuo@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.smallbun.screw.core.query.postgresql.model;

import cn.smallbun.screw.core.mapping.MappingField;
import cn.smallbun.screw.core.metadata.Table;
import lombok.Data;

/**
 * 表信息
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/3/17 20:22
 */
@Data
public class PostgreSqlTableModel implements Table {
    /**
     * refGeneration
     */
    @MappingField(value = "ref_generation")
    private String refGeneration;
    /**
     * typeName
     */
    @MappingField(value = "type_name")
    private String typeName;
    /**
     * typeSchem
     */
    @MappingField(value = "type_schem")
    private String typeSchem;
    /**
     * tableSchem
     */
    @MappingField(value = "table_schem")
    private String tableSchem;
    /**
     * typeCat
     */
    @MappingField(value = "type_cat")
    private String typeCat;
    /**
     * tableCat
     */
    @MappingField(value = "table_cat")
    private Object tableCat;
    /**
     * 表名称
     */
    @MappingField(value = "table_name")
    private String tableName;
    /**
     * selfReferencingColName
     */
    @MappingField(value = "self_referencing_col_name")
    private String selfReferencingColName;
    /**
     * 说明
     */
    @MappingField(value = "remarks")
    private String remarks;
    /**
     * 表类型
     */
    @MappingField(value = "table_type")
    private String tableType;
}