/*
 * This file is generated by jOOQ.
*/
package com.apress.demo.jooq.domain;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_0558E38E_6B1D_43FA_B95C_34A85A5B6C82</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_0558E38E_6B1D_43FA_B95C_34A85A5B6C82 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_0558E38E_6B1D_43FA_B95C_34A85A5B6C82", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_8E42374F_16E6_47DC_87A8_BA6808C01C1C</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_8E42374F_16E6_47DC_87A8_BA6808C01C1C = new SequenceImpl<Long>("SYSTEM_SEQUENCE_8E42374F_16E6_47DC_87A8_BA6808C01C1C", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
