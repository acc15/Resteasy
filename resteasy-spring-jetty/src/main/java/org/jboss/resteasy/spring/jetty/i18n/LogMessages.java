package org.jboss.resteasy.spring.jetty.i18n;

import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;
import org.jboss.logging.annotations.MessageLogger;

/**
 * 
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 * 
 * Copyright Dec 09, 2014
 */
@MessageLogger(projectCode = "RESTEASY")
public interface LogMessages extends BasicLogger
{
   LogMessages LOGGER = Logger.getMessageLogger(LogMessages.class, LogMessages.class.getPackage().getName());
}