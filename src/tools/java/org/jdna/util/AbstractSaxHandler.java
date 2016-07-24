//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.util;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public abstract class AbstractSaxHandler implements ContentHandler, ErrorHandler {
    protected static final Logger log = Logger.getLogger(AbstractSaxHandler.class);
    private boolean hasError = false;

    public AbstractSaxHandler() {
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
    }

    public void endDocument() throws SAXException {
    }

    public void endElement(String uri, String localName, String name) throws SAXException {
    }

    public void endPrefixMapping(String prefix) throws SAXException {
    }

    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
    }

    public void processingInstruction(String target, String data) throws SAXException {
    }

    public void setDocumentLocator(Locator locator) {
    }

    public void skippedEntity(String name) throws SAXException {
    }

    public void startDocument() throws SAXException {
    }

    public void startElement(String uri, String localName, String name, Attributes atts) throws SAXException {
    }

    public void startPrefixMapping(String prefix, String uri) throws SAXException {
    }

    public boolean hasError() {
        return this.hasError;
    }

    public void error(SAXParseException exception) throws SAXException {
        this.hasError = true;
        log.error("Sax Parsing Error!", exception);
    }

    public void fatalError(SAXParseException exception) throws SAXException {
        this.hasError = true;
        log.error("Fatal Sax Error!", exception);
    }

    public void warning(SAXParseException exception) throws SAXException {
        log.warn("Sax Warning!", exception);
    }
}
