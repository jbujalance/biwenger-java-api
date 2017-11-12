package org.biwenger.request;

import org.biwenger.response.AbstractResponse;

public interface IRequest<Response extends AbstractResponse> {

    public Response await();
}
