package com.example.demo; /*******************************************************************/
/* Copyright 2019 TransUnion LLC.  All Rights Reserved.            */
/*                                                                 */
/* No part of this work may be reproduced or distributed in any    */
/* form or by any means, electronic or otherwise, now known or     */
/* hereafter developed, including, but not limited to, the         */
/* Internet, without the explicit prior written consent from       */
/* TransUnion L.L.C.                                               */
/*                                                                 */
/* Requests for permission to reproduce or distribute any part of, */
/* or all of, this work should be mailed to:                       */
/* Law Department                                                  */
/* TransUnion                                                      */
/* 555 West Adams                                                  */
/* Chicago, Illinois 60661                                         */
/* www.transunion.com                                              */
/*                                                                 */
/*******************************************************************/

/*
 * Revision History
 * ---------------------------------------------------------------------------
 * Modified by    Version       Comments                       Date/Time
 * ---------------------------------------------------------------------------
 *  bvembu        0.1                                         7/23/2019
 * ---------------------------------------------------------------------------
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <DL>
 * <DT><B>Description:</B></DT>
 * <DD><Enter Class Description></DD>
 * </DL>
 * <DL>
 * <DT><B> Last Modified:</B></DT>
 * <DD>7/23/2019</DD>
 * </DL>
 *
 * @author bvembu
 * @version 0.1
 */
@RestController
public class Controller
{
    @GetMapping("/hello")
    public String hello(){
        System.out.println("Wow!! This is from the docker logs!!");
        return "Hello to Docker world";
    }
}
