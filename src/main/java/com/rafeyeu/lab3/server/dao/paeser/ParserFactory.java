package com.rafeyeu.lab3.server.dao.paeser;

import com.rafeyeu.lab3.server.dao.DaoFactory;
import com.rafeyeu.lab3.server.dao.paeser.description.XMLStudentInfoParser;
import com.rafeyeu.lab3.server.dao.paeser.description.XMLUserParser;
import com.rafeyeu.lab3.server.dao.paeser.impl.XMLStudentInfoParserImpl;
import com.rafeyeu.lab3.server.dao.paeser.impl.XMLUserParserImpl;

public class ParserFactory {

    private final XMLUserParser userParser=new XMLUserParserImpl();
    private final XMLStudentInfoParser studentInfoParser=new XMLStudentInfoParserImpl();

    public XMLUserParser getUserParser() {
        return userParser;
    }

    public XMLStudentInfoParser getStudentInfoParser() {
        return studentInfoParser;
    }

    public ParserFactory() {
    }

    public static ParserFactory getInstance() {
        return ParserFactory.Holder.INSTANCE;
    }

    private static class Holder {
        static final ParserFactory INSTANCE = new ParserFactory();
    }
}
